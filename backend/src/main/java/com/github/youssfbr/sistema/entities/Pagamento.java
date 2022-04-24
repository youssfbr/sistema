package com.github.youssfbr.sistema.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.youssfbr.sistema.models.enums.EstadoPagamento;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_pagamento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private Integer estadoPagamento;

    @MapsId
    @OneToOne
    @JsonIgnore
    @JoinColumn(name="pedido_id")
    private Pedido pedido;

    protected Pagamento(Long id, EstadoPagamento estado, Pedido pedido) {
        this.id = id;
        this.estadoPagamento = estado.getCodigo();
        this.pedido = pedido;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pagamento pagamento = (Pagamento) o;
        return id != null && Objects.equals(id, pagamento.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    
}
