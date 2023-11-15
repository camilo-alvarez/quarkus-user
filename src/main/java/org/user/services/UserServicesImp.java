package org.user.services;

import org.user.models.UserDTO;
import org.user.models.UsersDTO;

public interface UserServicesImp {
    UserDTO getUser(int userId);
    UsersDTO getUsers();
}
