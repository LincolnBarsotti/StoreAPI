package org.example.storeapi.domain.user;

public record DadosCadastro(String email, String senha, Role role) {
    public DadosCadastro(DadosCadastro dados) {
        this(dados.email(), dados.senha(), dados.role);
    }
}
