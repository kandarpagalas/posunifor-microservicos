package com.example.springboot_dataset.service;


import com.example.springboot_dataset.model.Pessoa;
import com.example.springboot_dataset.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> getAllPessoas() {
        return pessoaRepository.findAll();
    }


    public ResponseEntity<Pessoa> getPessoaById(String id) {
        return pessoaRepository.findById(id)
                .map(ResponseEntity :: ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<List<Pessoa>> getPessoaByName(String name) {
        List<Pessoa> pessoas = pessoaRepository.findByNomeContainingIgnoreCase(name);
        return ResponseEntity.ok(pessoas);
    }

    public ResponseEntity<List<Pessoa>> getPessoaByCidade(String category) {
        List<Pessoa> pessoas = pessoaRepository.findByCidadeContainingIgnoreCase(category);
        return ResponseEntity.ok(pessoas);
    }

    public ResponseEntity<List<Pessoa>> getPessoaBySalarioBetween(Double min, Double max) {
        List<Pessoa> pessoas = pessoaRepository.findBySalarioBetween(min, max);
        return ResponseEntity.ok(pessoas);
    }
}
