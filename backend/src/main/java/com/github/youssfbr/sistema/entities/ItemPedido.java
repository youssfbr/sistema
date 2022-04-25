package com.github.youssfbr.sistema.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_item_pedido")
public class ItemPedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private Double desconto;
    private Integer quantidade;
    private Double preco;


    public Pedido getPedido() {
        return id.getPedido();
    }

    public Produto getProduto() {
        return id.getProduto();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItemPedido itemPedido = (ItemPedido) o;
        return id != null && Objects.equals(id, itemPedido.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
