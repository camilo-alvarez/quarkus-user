package org.user.models;

import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.List;

@Data
@Schema(description = "Users")
public class UsersDTO {

    private int total;
    private List<UserDTO> users;
}
