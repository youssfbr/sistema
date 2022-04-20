package com.github.youssfbr.sistema.services.interfaces;

import com.github.youssfbr.sistema.entities.Categoria;

import java.util.List;

public interface ICategoriaService {

    List<Categoria> listar();
    Categoria buscar(Long id);
}
