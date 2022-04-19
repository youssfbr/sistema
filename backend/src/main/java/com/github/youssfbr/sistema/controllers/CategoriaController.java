package com.github.youssfbr.sistema.controllers;

import com.github.youssfbr.sistema.entities.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @GetMapping
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1L, "Informática");
        Categoria cat2 = new Categoria(2L, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        return lista;
    }
}
