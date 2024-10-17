package bg.technologies.adventure.service.impl;

import bg.technologies.adventure.models.User;
import bg.technologies.adventure.models.dto.UserLoginDTO;
import bg.technologies.adventure.models.dto.UserRegisterDTO;
import bg.technologies.adventure.repository.UserRepository;
import bg.technologies.adventure.service.UserService;
import bg.technologies.adventure.service.session.LoggedUser;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final LoggedUser loggedUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.loggedUser = loggedUser;
    }

    @Override
    public void register(UserRegisterDTO userRegisterDTO) {
        User user = modelMapper.map(userRegisterDTO, User.class);
        user.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        userRepository.save(user);
    }

    @Override
    public boolean login(UserLoginDTO userLoginDTO) {
        String username = userLoginDTO.getUsername();
        User user = this.userRepository.findByUsername(username);

        if (user == null) {
            throw new IllegalArgumentException("User: " + username + " not found");
        }
       boolean passwordMatch = passwordEncoder.matches(userLoginDTO.getPassword(), user.getPassword());

        if (!passwordMatch) {
            throw new IllegalArgumentException("Wrong password");
        }
        loggedUser.setUsername(user.getUsername());
        loggedUser.setEmail(user.getEmail());
        loggedUser.setFullName(user.getFullName());

        return passwordMatch;
    }
}
