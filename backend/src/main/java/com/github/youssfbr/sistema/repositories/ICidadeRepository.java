package com.github.youssfbr.sistema.repositories;

import com.github.youssfbr.sistema.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
}
