package com.github.youssfbr.sistema.services.interfaces;


import com.github.youssfbr.sistema.entities.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> listar();
    Cliente buscar(Long id);
    Cliente inserir(Cliente cliente);

}
