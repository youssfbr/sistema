package com.github.youssfbr.sistema.services;

import com.github.youssfbr.sistema.entities.Categoria;
import com.github.youssfbr.sistema.entities.Cliente;
import com.github.youssfbr.sistema.repositories.IClienteRepository;
import com.github.youssfbr.sistema.services.exceptions.ObjectNotFoundException;
import com.github.youssfbr.sistema.services.interfaces.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService implements IClienteService {

    private final IClienteRepository clienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente buscar(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. ID " + id));
    }

    @Override
    @Transactional
    public Cliente inserir(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


}
