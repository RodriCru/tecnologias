/*Este es el archivo de repositorio, es el encargado de gestionar la 
 * cominucación con la base de datos y la gestión de datos
 */
package com.tecnologias.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tecnologias.api.models.User;

public interface UserRepository extends JpaRepository<User,UUID> {

    
}

