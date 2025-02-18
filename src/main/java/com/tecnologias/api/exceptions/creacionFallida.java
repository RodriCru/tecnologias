package com.tecnologias.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class creacionFallida extends RuntimeException{
    public creacionFallida(String mensaje){ super(mensaje);}
}
