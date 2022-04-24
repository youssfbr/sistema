package com.github.youssfbr.sistema.repositories;

import com.github.youssfbr.sistema.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPagamentoRepository extends JpaRepository<Pagamento, Long> {
}
