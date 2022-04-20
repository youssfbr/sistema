package com.github.youssfbr.sistema.repositories;

import com.github.youssfbr.sistema.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICidadeRepository extends JpaRepository<Cidade, Long> {
}
