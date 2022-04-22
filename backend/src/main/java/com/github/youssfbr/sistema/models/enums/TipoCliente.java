package com.github.youssfbr.sistema.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoCliente {

    PESSOA_FISICA(1,"Física"),
    PESSOA_JURIDICA(2, "Jurídica");

    private final int codigo;
    private final String descricao;

    public static TipoCliente toEnum(Integer codigo) {

        if (codigo == null) return null;

        for (TipoCliente pessoa_fisica_ou_juridica : TipoCliente.values()) {
            if (codigo.equals(pessoa_fisica_ou_juridica.getCodigo())) {
                return pessoa_fisica_ou_juridica;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + codigo);
    }

}
