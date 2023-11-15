package org.user.models;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Data
@Schema(description = "Company formats")
public class CompanyDTO {

    private AddressDTO addressDTO;

    private String department;

    private String name;

    private String title;

    @JsonbProperty("direccionEmpresa")
    public AddressDTO getAddressDTO() {
        return addressDTO;
    }

    @JsonbProperty("departamento")
    public String getDepartment() {
        return department;
    }
    @JsonbProperty("nombre")
    public String getName() {
        return name;
    }
    @JsonbProperty("posicion")
    public String getTitle() {
        return title;
    }
}
