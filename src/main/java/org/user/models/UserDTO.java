package org.user.models;

import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.json.bind.annotation.JsonbProperty;
import lombok.Data;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.LocalDate;

@Data
@Schema(description = "A user")
public class UserDTO {

    @Schema(required = true)
    private long id;

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String email;

    private String phone;

    private String username;

    @JsonbDateFormat("yyyy-MM-dd")
    private LocalDate birthDate;

    private int height;

    private double weight;

    private AddressDTO address;

    private CompanyDTO company;

    public long getId() {
        return id;
    }
    @JsonbProperty("nombreCompleto")
    public String getFullName() {
        return firstName + " " + lastName;
    }
    @JsonbProperty("edad")
    public int getAge() {
        return age;
    }
    @JsonbProperty("genero")
    public String getGender() {
        return gender;
    }
    @JsonbProperty("email")
    public String getEmail() {
        return email;
    }
    @JsonbProperty("telefono")
    public String getPhone() {
        return phone;
    }
    @JsonbProperty("usuario")
    public String getUsername() {
        return username;
    }
    @JsonbProperty("fechaNacimiento")
    public LocalDate getBirthDate() {
        return birthDate;
    }
    @JsonbProperty("altura")
    public int getHeight() {
        return height;
    }
    @JsonbProperty("peso")
    public double getWeight() {
        return weight;
    }

    @JsonbProperty("direccion")
    public AddressDTO getAddress() {
        return address;
    }
    @JsonbProperty("trabajo")
    public CompanyDTO getCompany() {
        return company;
    }

}