package com.tecnologias.api.controllers;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tecnologias.api.dtos.UserDTO;
import com.tecnologias.api.services.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@AllArgsConstructor
@RestController
@RequestMapping("api/users")

public class UserControlador {

    UserServices userServices;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO){
        UserDTO nuevUserDTO = userServices.createUser(userDTO);
        return new ResponseEntity<>(nuevUserDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> obtenerUserPorId(@PathVariable UUID id){
        UserDTO userDTO = userServices.obtenerUserPorId(id);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> actualizarUser(@PathVariable UUID id, @RequestBody UserDTO userDTO){
        UserDTO userActualizadoDTO = userServices.actualizaUser(id, userDTO);
        return new ResponseEntity<>(userActualizadoDTO, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable UUID id){
        userServices.eliminarUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    private ResponseEntity<List<UserDTO>> buscarTodos(){
        List<UserDTO> user = userServices.obtenerUsers();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
