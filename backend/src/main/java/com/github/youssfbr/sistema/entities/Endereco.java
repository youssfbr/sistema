package com.github.youssfbr.sistema.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter

@Table(name = "tb_endereco")
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String logradouro;

    @Column(length = 20)
    private String numero;

    @Column(length = 40)
    private String complemento;

    @Column(length = 10)
    private String cep;


    @ManyToOne
    private Bairro bairro;

    @JsonBackReference
    @ManyToOne
    private Cliente cliente;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Endereco endereco = (Endereco) o;
        return id != null && Objects.equals(id, endereco.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
