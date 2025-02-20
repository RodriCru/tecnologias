/*En este archivo se declara el dto usuario y se declaran sus atributos */
package com.tecnologias.api.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.ZonedDateTime;
import java.util.UUID;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private UUID id;
    private String password;
    private ZonedDateTime lastLogin;
    private boolean isSuperuser;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private ZonedDateTime dateJoined;
    private ZonedDateTime createdAt;
    private ZonedDateTime modifiedAt;
    private boolean isDeleted;
    private ZonedDateTime deletedAt;
    private String username;
    private String email;
    private String profilePicture;
    private boolean emailVerified;
    private ZonedDateTime emailVerifiedAt;
    private String nationality;
    private String occupation;
    private LocalDate dateOfBirth;
    private String contactPhoneNumber;
    private String gender;
    private String address;
    private String addressNumber;
    private String addressInteriorNumber;
    private String addressComplement;
    private String addressNeighborhood;
    private String addressZipCode;
    private String addressCity;
    private String addressState;
    private String role;   
}
