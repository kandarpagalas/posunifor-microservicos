package com.example.springboot_dataset.repository;

import com.example.springboot_dataset.model.Item;
import com.example.springboot_dataset.model.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//private String id;
//private String nome;
//private Integer idade;
//private String cidade;
//private String email;
//private String telefone;
//private String genero;
//private String ocupacao;
//private Double salario;
//private Boolean casado;
//public List<Item> findByNameContainingIgnoreCase(String name);
//public List<Item> findByCategoryContainingIgnoreCase(String name);
//public List<Item> findByPriceBetween(Double min, Double max);

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String> {

    public List<Pessoa> findByNomeContainingIgnoreCase(String nome);
    public List<Pessoa> findByCidadeContainingIgnoreCase(String cidade);
    public List<Pessoa> findBySalarioBetween(Double min, Double max);
}
