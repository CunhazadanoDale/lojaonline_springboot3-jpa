package com.aprendendoweb.curso.repositories;

import com.aprendendoweb.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
