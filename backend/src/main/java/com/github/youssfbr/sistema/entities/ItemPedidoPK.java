package com.github.youssfbr.sistema.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Getter@Setter
public class ItemPedidoPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

}
