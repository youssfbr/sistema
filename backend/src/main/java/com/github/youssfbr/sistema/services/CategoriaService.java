package com.github.youssfbr.sistema.services;

import com.github.youssfbr.sistema.entities.Categoria;
import com.github.youssfbr.sistema.repositories.ICategoriaRepository;
import com.github.youssfbr.sistema.services.interfaces.ICategoriaService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService implements ICategoriaService {

    private final ICategoriaRepository categoriaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria buscar(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(null);
    }


}
