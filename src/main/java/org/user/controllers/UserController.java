package org.user.controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.user.services.UserServicesImp;

@Path("/users")
@Tag(name = "User REST Endpoint")
public class UserController {
    @Inject
    UserServicesImp userServices;

    @GET
    @Path("/{userID}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "get user by id")
    public Response getUserByID(@PathParam("userID") int userID) {
        if (userID < 1 || userID > 100) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("The user ID must be in the range between 1 and 100.")
                    .build();
        }
        return Response.status(201).entity(userServices.getUser(userID)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "get all users")
    public Response getUsers() {
        return Response.status(201).entity(userServices.getUsers()).build();
    }
}
