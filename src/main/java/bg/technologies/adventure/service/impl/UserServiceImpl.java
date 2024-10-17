package bg.technologies.adventure.service.impl;

import bg.technologies.adventure.models.User;
import bg.technologies.adventure.repository.UserRepository;
import bg.technologies.adventure.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
