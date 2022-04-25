package com.github.youssfbr.sistema.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.Hibernate;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private Date instante;


    @OneToOne(cascade=CascadeType.ALL, mappedBy="pedido")
    private Pagamento pagamento;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Endereco enderecoDeEntrega;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido> itens = new HashSet<>();

    public Pedido(Long id, Date instante, Cliente cliente, Endereco enderecoDeEntrega) {
        this.id = id;
        this.instante = instante;
        this.cliente = cliente;
        this.enderecoDeEntrega = enderecoDeEntrega;
    }

    public Set<ItemPedido> getItem() {
        return itens;
    }

    public void setItens(Set<ItemPedido> itens) {
        this.itens = itens;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pedido pedido = (Pedido) o;
        return id != null && Objects.equals(id, pedido.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    
}
