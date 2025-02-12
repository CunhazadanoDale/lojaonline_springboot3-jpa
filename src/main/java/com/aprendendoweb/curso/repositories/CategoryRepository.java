package com.aprendendoweb.curso.repositories;

import com.aprendendoweb.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
