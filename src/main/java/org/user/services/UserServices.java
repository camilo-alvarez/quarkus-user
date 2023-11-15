package org.user.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;
import org.user.models.UserDTO;
import org.user.models.UsersDTO;
import org.user.repository.UserServiceClient;

@ApplicationScoped
public class UserServices implements UserServicesImp {

    @Inject
    Logger logger;
    @Inject
    @RestClient
    UserServiceClient userServiceClient;

    @Override
    public UserDTO getUser(int userId) {
        var user = userServiceClient.getUser(userId);

        logger.info("Get user with ID " + user.getId());
        return user;
    }

    @Override
    public UsersDTO getUsers() {
        var users = userServiceClient.getUsers();

        logger.info("Get users ");
        return users;
    }

}
