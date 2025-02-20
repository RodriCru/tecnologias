package com.tecnologias.api.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tecnologias.api.dtos.UserDTO;
import com.tecnologias.api.exceptions.creacionFallida;
import com.tecnologias.api.exceptions.recursoNoEncontrado;
import com.tecnologias.api.models.User;
import com.tecnologias.api.repositories.UserRepository;
import com.tecnologias.api.services.UserServices;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        if (userDTO.getPassword() == null
                || userDTO.getFirstName() == null || userDTO.getLastName() == null ||
                userDTO.getDateJoined() == null || userDTO.getCreatedAt() == null ||
                userDTO.getModifiedAt() == null || userDTO.getUsername() == null) {
            throw new creacionFallida("Algun campo esta vacio, verifique por favor");
        }

        User user = new User();
        user.setPassword(userDTO.getPassword());
        user.setLastLogin(userDTO.getLastLogin());
        user.setSuperuser(userDTO.isSuperuser());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setActive(userDTO.isActive());
        user.setDateJoined(userDTO.getDateJoined());
        user.setCreatedAt(userDTO.getCreatedAt());
        user.setModifiedAt(userDTO.getModifiedAt());
        user.setDeleted(userDTO.isDeleted());
        user.setDeletedAt(userDTO.getDeletedAt());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setProfilePicture(userDTO.getProfilePicture());
        user.setEmailVerified(userDTO.isEmailVerified());
        user.setEmailVerifiedAt(userDTO.getEmailVerifiedAt());
        user.setNationality(userDTO.getNationality());
        user.setOccupation(userDTO.getOccupation());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setContactPhoneNumber(userDTO.getContactPhoneNumber());
        user.setGender(userDTO.getGender());
        user.setAddress(userDTO.getAddress());
        user.setAddressNumber(userDTO.getAddressNumber());
        user.setAddressInteriorNumber(userDTO.getAddressInteriorNumber());
        user.setAddressComplement(userDTO.getAddressComplement());
        user.setAddressNeighborhood(userDTO.getAddressNeighborhood());
        user.setAddressZipCode(userDTO.getAddressZipCode());
        user.setAddressCity(userDTO.getAddressCity());
        user.setAddressState(userDTO.getAddressState());
        user.setRole(userDTO.getRole());

        user = userRepository.save(user);

        UserDTO nuevoUserDTO = new UserDTO();
        nuevoUserDTO.setId(user.getId());
        nuevoUserDTO.setPassword(user.getPassword());
        nuevoUserDTO.setLastLogin(user.getLastLogin());
        nuevoUserDTO.setSuperuser(user.isSuperuser());
        nuevoUserDTO.setFirstName(user.getFirstName());
        nuevoUserDTO.setLastName(user.getLastName());
        nuevoUserDTO.setActive(user.isActive());
        nuevoUserDTO.setDateJoined(user.getDateJoined());
        nuevoUserDTO.setCreatedAt(user.getCreatedAt());
        nuevoUserDTO.setModifiedAt(user.getModifiedAt());
        nuevoUserDTO.setDeleted(user.isDeleted());
        nuevoUserDTO.setDeletedAt(user.getDeletedAt());
        nuevoUserDTO.setUsername(user.getUsername());
        nuevoUserDTO.setEmail(user.getEmail());
        nuevoUserDTO.setProfilePicture(user.getProfilePicture());
        nuevoUserDTO.setEmailVerified(user.isEmailVerified());
        nuevoUserDTO.setEmailVerifiedAt(user.getEmailVerifiedAt());
        nuevoUserDTO.setNationality(user.getNationality());
        nuevoUserDTO.setOccupation(user.getOccupation());
        nuevoUserDTO.setDateOfBirth(user.getDateOfBirth());
        nuevoUserDTO.setContactPhoneNumber(user.getContactPhoneNumber());
        nuevoUserDTO.setGender(user.getGender());
        nuevoUserDTO.setAddress(user.getAddress());
        nuevoUserDTO.setAddressNumber(user.getAddressNumber());
        nuevoUserDTO.setAddressInteriorNumber(user.getAddressInteriorNumber());
        nuevoUserDTO.setAddressComplement(user.getAddressComplement());
        nuevoUserDTO.setAddressNeighborhood(user.getAddressNeighborhood());
        nuevoUserDTO.setAddressZipCode(user.getAddressZipCode());
        nuevoUserDTO.setAddressCity(user.getAddressCity());
        nuevoUserDTO.setAddressState(user.getAddressState());
        nuevoUserDTO.setRole(user.getRole());

        return nuevoUserDTO;
    }

    @Override
    public UserDTO obtenerUserPorId(UUID id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new recursoNoEncontrado("El usuario con el id: " + id + " No existe"));

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setPassword(user.getPassword());
        userDTO.setLastLogin(user.getLastLogin());
        userDTO.setSuperuser(user.isSuperuser());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setActive(user.isActive());
        userDTO.setDateJoined(user.getDateJoined());
        userDTO.setCreatedAt(user.getCreatedAt());
        userDTO.setModifiedAt(user.getModifiedAt());
        userDTO.setDeleted(user.isDeleted());
        userDTO.setDeletedAt(user.getDeletedAt());
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        userDTO.setProfilePicture(user.getProfilePicture());
        userDTO.setEmailVerified(user.isEmailVerified());
        userDTO.setEmailVerifiedAt(user.getEmailVerifiedAt());
        userDTO.setNationality(user.getNationality());
        userDTO.setOccupation(user.getOccupation());
        userDTO.setDateOfBirth(user.getDateOfBirth());
        userDTO.setContactPhoneNumber(user.getContactPhoneNumber());
        userDTO.setGender(user.getGender());
        userDTO.setAddress(user.getAddress());
        userDTO.setAddressNumber(user.getAddressNumber());
        userDTO.setAddressInteriorNumber(user.getAddressInteriorNumber());
        userDTO.setAddressComplement(user.getAddressComplement());
        userDTO.setAddressNeighborhood(user.getAddressNeighborhood());
        userDTO.setAddressZipCode(user.getAddressZipCode());
        userDTO.setAddressCity(user.getAddressCity());
        userDTO.setAddressState(user.getAddressState());
        userDTO.setRole(user.getRole());

        return userDTO;

    }

    @Override
    public List<UserDTO> obtenerUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> {
                    UserDTO userDTO = new UserDTO();
                    userDTO.setId(user.getId());
                    userDTO.setPassword(user.getPassword());
                    userDTO.setLastLogin(user.getLastLogin());
                    userDTO.setSuperuser(user.isSuperuser());
                    userDTO.setFirstName(user.getFirstName());
                    userDTO.setLastName(user.getLastName());
                    userDTO.setActive(user.isActive());
                    userDTO.setDateJoined(user.getDateJoined());
                    userDTO.setCreatedAt(user.getCreatedAt());
                    userDTO.setModifiedAt(user.getModifiedAt());
                    userDTO.setDeleted(user.isDeleted());
                    userDTO.setDeletedAt(user.getDeletedAt());
                    userDTO.setUsername(user.getUsername());
                    userDTO.setEmail(user.getEmail());
                    userDTO.setProfilePicture(user.getProfilePicture());
                    userDTO.setEmailVerified(user.isEmailVerified());
                    userDTO.setEmailVerifiedAt(user.getEmailVerifiedAt());
                    userDTO.setNationality(user.getNationality());
                    userDTO.setOccupation(user.getOccupation());
                    userDTO.setDateOfBirth(user.getDateOfBirth());
                    userDTO.setContactPhoneNumber(user.getContactPhoneNumber());
                    userDTO.setGender(user.getGender());
                    userDTO.setAddress(user.getAddress());
                    userDTO.setAddressNumber(user.getAddressNumber());
                    userDTO.setAddressInteriorNumber(user.getAddressInteriorNumber());
                    userDTO.setAddressComplement(user.getAddressComplement());
                    userDTO.setAddressNeighborhood(user.getAddressNeighborhood());
                    userDTO.setAddressZipCode(user.getAddressZipCode());
                    userDTO.setAddressCity(user.getAddressCity());
                    userDTO.setAddressState(user.getAddressState());
                    userDTO.setRole(user.getRole());

                    return userDTO;
                })
                .collect(Collectors.toList());

    }

    @Override
    public UserDTO actualizaUser(UUID id, UserDTO userDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new recursoNoEncontrado("El producto con el Id: " + id + " No existe"));
        if (userDTO.getPassword() == null
                || userDTO.getFirstName() == null || userDTO.getLastName() == null ||
                userDTO.getDateJoined() == null || userDTO.getCreatedAt() == null ||
                userDTO.getModifiedAt() == null || userDTO.getUsername() == null) {
            throw new creacionFallida("Algun campo esta vacio o incorrecto, verifique por favor");
        }

        user.setPassword(userDTO.getPassword());
        user.setLastLogin(userDTO.getLastLogin());
        user.setSuperuser(userDTO.isSuperuser());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setActive(userDTO.isActive());
        user.setDateJoined(userDTO.getDateJoined());
        user.setCreatedAt(userDTO.getCreatedAt());
        user.setModifiedAt(userDTO.getModifiedAt());
        user.setDeleted(userDTO.isDeleted());
        user.setDeletedAt(userDTO.getDeletedAt());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setProfilePicture(userDTO.getProfilePicture());
        user.setEmailVerified(userDTO.isEmailVerified());
        user.setEmailVerifiedAt(userDTO.getEmailVerifiedAt());
        user.setNationality(userDTO.getNationality());
        user.setOccupation(userDTO.getOccupation());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setContactPhoneNumber(userDTO.getContactPhoneNumber());
        user.setGender(userDTO.getGender());
        user.setAddress(userDTO.getAddress());
        user.setAddressNumber(userDTO.getAddressNumber());
        user.setAddressInteriorNumber(userDTO.getAddressInteriorNumber());
        user.setAddressComplement(userDTO.getAddressComplement());
        user.setAddressNeighborhood(userDTO.getAddressNeighborhood());
        user.setAddressZipCode(userDTO.getAddressZipCode());
        user.setAddressCity(userDTO.getAddressCity());
        user.setAddressState(userDTO.getAddressState());
        user.setRole(userDTO.getRole());

        user = userRepository.save(user);

        UserDTO actualizaUserDTO = new UserDTO();
        actualizaUserDTO.setId(user.getId());
        actualizaUserDTO.setPassword(user.getPassword());
        actualizaUserDTO.setLastLogin(user.getLastLogin());
        actualizaUserDTO.setSuperuser(user.isSuperuser());
        actualizaUserDTO.setFirstName(user.getFirstName());
        actualizaUserDTO.setLastName(user.getLastName());
        actualizaUserDTO.setActive(user.isActive());
        actualizaUserDTO.setDateJoined(user.getDateJoined());
        actualizaUserDTO.setCreatedAt(user.getCreatedAt());
        actualizaUserDTO.setModifiedAt(user.getModifiedAt());
        actualizaUserDTO.setDeleted(user.isDeleted());
        actualizaUserDTO.setDeletedAt(user.getDeletedAt());
        actualizaUserDTO.setUsername(user.getUsername());
        actualizaUserDTO.setEmail(user.getEmail());
        actualizaUserDTO.setProfilePicture(user.getProfilePicture());
        actualizaUserDTO.setEmailVerified(user.isEmailVerified());
        actualizaUserDTO.setEmailVerifiedAt(user.getEmailVerifiedAt());
        actualizaUserDTO.setNationality(user.getNationality());
        actualizaUserDTO.setOccupation(user.getOccupation());
        actualizaUserDTO.setDateOfBirth(user.getDateOfBirth());
        actualizaUserDTO.setContactPhoneNumber(user.getContactPhoneNumber());
        actualizaUserDTO.setGender(user.getGender());
        actualizaUserDTO.setAddress(user.getAddress());
        actualizaUserDTO.setAddressNumber(user.getAddressNumber());
        actualizaUserDTO.setAddressInteriorNumber(user.getAddressInteriorNumber());
        actualizaUserDTO.setAddressComplement(user.getAddressComplement());
        actualizaUserDTO.setAddressNeighborhood(user.getAddressNeighborhood());
        actualizaUserDTO.setAddressZipCode(user.getAddressZipCode());
        actualizaUserDTO.setAddressCity(user.getAddressCity());
        actualizaUserDTO.setAddressState(user.getAddressState());
        actualizaUserDTO.setRole(user.getRole());

        return actualizaUserDTO;
    }

    @Override
    public void eliminarUser(UUID id){
        User user = userRepository.findById(id).orElseThrow(()->
            new recursoNoEncontrado("El producto con el id "+id+" No existe"));
        userRepository.deleteById(id);
    }
}
