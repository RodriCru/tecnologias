package com.tecnologias.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class recursoNoEncontrado extends RuntimeException {
    public recursoNoEncontrado(String mensaje){ super(mensaje); }
}
