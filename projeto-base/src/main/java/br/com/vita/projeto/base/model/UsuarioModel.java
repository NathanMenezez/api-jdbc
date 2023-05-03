package br.com.vita.projeto.base.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioModel {
    private Integer id;
    
    private String nome;

    private String cpf;

    private String email;

    private String telefone;

    private String endereco;

    public UsuarioModel(){}
}
