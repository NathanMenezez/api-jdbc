package br.com.vita.projeto.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProdutoModel {
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;
    private Integer quantidadeEstoque;

    public ProdutoModel(){}
}
