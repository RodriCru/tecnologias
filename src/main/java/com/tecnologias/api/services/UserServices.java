/*Aqui se crean la interfaz de los métodos (endpoints) que implementaremos */
package com.tecnologias.api.services;

import com.tecnologias.api.dtos.UserDTO;
import java.util.List;
import java.util.UUID;

public interface UserServices {
    UserDTO createUser(UserDTO userDTO);
    UserDTO obtenerUserPorId(UUID id);
    UserDTO actualizaUser(UUID id, UserDTO userDTO);
    List<UserDTO> obtenerUsers();
    void eliminarUser(UUID id);
}
