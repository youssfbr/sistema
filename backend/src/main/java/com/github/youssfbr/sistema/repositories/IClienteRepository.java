package com.github.youssfbr.sistema.repositories;

import com.github.youssfbr.sistema.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {
}
