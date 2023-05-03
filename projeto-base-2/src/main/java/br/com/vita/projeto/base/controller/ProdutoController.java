package br.com.vita.projeto.base.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.vita.projeto.base.dto.ProdutoDTO;
import br.com.vita.projeto.base.service.ProdutoService;

@RestController
public class ProdutoController {
    
    @Autowired
    ProdutoService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarProduto(@RequestBody @Valid ProdutoDTO produtoDto){
        return service.cadastrarProduto(produtoDto);
    }

    @GetMapping("/listar/{nome}")
    public ResponseEntity<?> listarProdutoNome(@PathVariable String nome){
        return service.listarProdutoNome(nome);
    }

    @PutMapping("/alterar/{nome}")
    public ResponseEntity<String> alterarProduto(@PathVariable String nome ,@RequestBody @Valid ProdutoDTO produtoDTO){
        return service.alterarProduto(nome, produtoDTO);
    }

    @DeleteMapping("/deletar/{nome}")
    public ResponseEntity<String> deletarProduto(@PathVariable String nome){
        return service.deletarProduto(nome);
    }
}
