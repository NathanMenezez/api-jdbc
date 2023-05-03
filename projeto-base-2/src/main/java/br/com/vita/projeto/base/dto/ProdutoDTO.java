package br.com.vita.projeto.base.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ProdutoDTO {
    @NotBlank(message = "Preencha o nome!")
    private String nome;

    @NotBlank(message = "Preencha a descrição!")
    private String descricao;

    @NotNull(message = "Preencha o preço!")
    private Double preco;

    @NotNull(message = "Preencha a quantidade em estoque!")
    private Integer quantidadeEstoque;
}
