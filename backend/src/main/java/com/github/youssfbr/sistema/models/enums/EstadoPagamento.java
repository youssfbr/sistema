package com.github.youssfbr.sistema.models.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EstadoPagamento {

    PENDENTE(1,"Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private final int codigo;
    private final String descricao;

    public static EstadoPagamento toEnum(Integer codigo) {

        if (codigo == null) return null;

        for (EstadoPagamento estadoPagamento : EstadoPagamento.values()) {
            if (codigo.equals(estadoPagamento.getCodigo())) {
                return estadoPagamento;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + codigo);
    }

}
