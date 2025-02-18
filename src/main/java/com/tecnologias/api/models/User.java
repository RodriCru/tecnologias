package com.tecnologias.api.models;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name="password")
    private String password;

    @Column(name="last_login")
    private ZonedDateTime lastLogin;
    
    @Column(name="is_superuser")
    private boolean isSuperuser;
    
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="is_active")
    private boolean isActive;

    @Column(name="date_joined")
    private ZonedDateTime dateJoined;

    @Column(name="created_at")
    private ZonedDateTime createdAt;

    @Column(name="modified_at")
    private ZonedDateTime modifiedAt;

    @Column(name="is_deleted")
    private boolean isDeleted;

    @Column(name="deleted_at")
    private ZonedDateTime deletedAt;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="profile_picture")
    private String profilePicture;

    @Column(name="email_verified")
    private boolean emailVerified;

    @Column(name="email_verified_at")
    private ZonedDateTime emailVerifiedAt;

    @Column(name="nationality")
    private String nationality;

    @Column(name="occupation")
    private String occupation;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="contact_phone_number")
    private String contactPhoneNumber;
    
    @Column(name="gender")
    private String gender;

    @Column(name="address")
    private String address;

    @Column(name="address_number")
    private String addressNumber;

    @Column(name="address_interior_number")
    private String addressInteriorNumber;

    @Column(name="address_complement")
    private String addressComplement;

    @Column(name="address_neighborhood")
    private String addressNeighborhood;

    @Column(name="address_zip_code")
    private String addressZipCode;

    @Column(name="address_city")
    private String addressCity;

    @Column(name="address_state")
    private String addressState;

    @Column(name="role")
    private String role;

    @PrePersist
    public void generateUUID() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }
    
    /*public long getId(){

        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public boolean getSuperuser(){
        return superuser;
    }

    public void setSuperuser(boolean superuser){
        this.superuser = superuser;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }

    public boolean getActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public String getDateJoined(){
        return joined;
    }

    public void setJoined(String DataJoined){
        this.joined = joined;
    }

    public String getModified(){
        return modified;
    }

    public void setModified(String modified){
        this.modified = modified;
    }

    public boolean getDeleted(){
        return deleted;
    }

    public void setDeleted(boolean deleted){
        this.deleted = deleted;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getEmailVerified(){
        return emailVerified;
    }

    public void setEmailVerified(String emailVerified){
        this.emailVerified = emailVerified;
    }*/
}
