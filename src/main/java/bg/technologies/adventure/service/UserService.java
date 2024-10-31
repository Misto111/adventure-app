package bg.technologies.adventure.service;

import bg.technologies.adventure.models.dto.UserLoginDTO;
import bg.technologies.adventure.models.dto.UserRegisterDTO;



public interface UserService {

   void register(UserRegisterDTO userRegisterDTO);

   boolean login(UserLoginDTO userLoginDTO);

    void logout();

}
