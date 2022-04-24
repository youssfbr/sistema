package com.github.youssfbr.sistema.repositories;

import com.github.youssfbr.sistema.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
}
