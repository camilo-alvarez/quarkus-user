package org.user.repository;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.user.models.UserDTO;
import org.user.models.UsersDTO;

@RegisterRestClient(configKey = "user.proxy")
@Path("/users")
public interface UserServiceClient {


    @GET
    @Path("/{id}")
    UserDTO getUser(@PathParam("id") int id);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    UsersDTO getUsers();

}
