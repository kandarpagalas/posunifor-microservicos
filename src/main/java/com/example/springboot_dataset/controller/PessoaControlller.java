package com.example.springboot_dataset.controller;


import com.example.springboot_dataset.model.Item;
import com.example.springboot_dataset.model.Pessoa;
import com.example.springboot_dataset.service.ItemService;
import com.example.springboot_dataset.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;







//@GetMapping("/by-price")
//public ResponseEntity<List<Item>> getItemByPriceBetween(@RequestParam Double min, @RequestParam Double max) {
//    return itemService.getItemByPriceBetween(min, max);
//}

@RestController
@RequestMapping("/pessoas")
public class PessoaControlller {
    @Autowired
    PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> getAllPessoas() {
        return pessoaService.getAllPessoas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getPessoaById(@PathVariable String id) {
        return pessoaService.getPessoaById(id);
    }

    @GetMapping("/by-nome")
    public ResponseEntity<List<Pessoa>> getPessoaByNome(@RequestParam String nome) {
        return pessoaService.getPessoaByNome(nome);
    }

    @GetMapping("/by-cidade")
    public ResponseEntity<List<Pessoa>> getPessoaByCidade(@RequestParam String cidade) {
        return pessoaService.getPessoaByCidade(cidade);
    }

    @GetMapping("/by-salario")
    public ResponseEntity<List<Pessoa>> getPessoaBySalarioBetween(@RequestParam Double min, Double max) {
        return pessoaService.getPessoaBySalarioBetween(min, max);
    }


}
