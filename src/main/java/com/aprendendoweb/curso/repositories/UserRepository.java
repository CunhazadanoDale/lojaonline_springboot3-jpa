package com.aprendendoweb.curso.repositories;

import com.aprendendoweb.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long> {

}
