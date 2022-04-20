package com.github.youssfbr.sistema.repositories;

import com.github.youssfbr.sistema.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
}
