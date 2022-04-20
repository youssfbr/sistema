package com.github.youssfbr.sistema.controllers;

import com.github.youssfbr.sistema.entities.Categoria;
import com.github.youssfbr.sistema.services.interfaces.ICategoriaService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final ICategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listar();
    }

    @GetMapping("{id}")
    public Categoria buscar(@PathVariable Long id) {
        return categoriaService.buscar(id);
    }
}
