package com.github.youssfbr.sistema.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.github.youssfbr.sistema.models.enums.TipoCliente;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String nome;

    @Column(length = 40, unique = true)
    private String email;

    @Column(length = 14, unique = true)
    private String cpfOuCnpj;

    private LocalDate birthDate;

    @Column(nullable = false, updatable = false)
    private Instant registerDate;

    @Column(columnDefinition = "TEXT")
    private String note;

    private Integer tipo;

    @JsonManagedReference
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
    private final List<Endereco> enderecos = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "tb_telefone")
    private final Set<String> telefones = new HashSet<>();


    public Cliente(Long id, String nome, String email, String cpfOuCnpj, LocalDate birthDate, String note, TipoCliente tipoCliente1) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.birthDate = birthDate;
        this.note = note;
        this.tipo = tipoCliente1.getCodigo();
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCodigo();
    }

    @PrePersist
    private void prePersist() {
        setRegisterDate(Instant.now());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Cliente cliente = (Cliente) o;
        return id != null && Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
