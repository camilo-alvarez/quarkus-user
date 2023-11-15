package org.user.models;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import lombok.Data;

@Data
public class AddressDTO {

    private String address;

    private String city;

    private String postalCode;

    private String state;

    @JsonbProperty("direccion")
    public String getAddress() {
        return address;
    }

    @JsonbProperty("ciudad")
    public String getCity() {
        return city;
    }

    @JsonbProperty("codigoPostal")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonbTransient
    public String getState() {
        return state;
    }
}
