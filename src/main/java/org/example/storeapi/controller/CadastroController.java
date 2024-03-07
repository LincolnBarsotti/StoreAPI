package org.example.storeapi.controller;

import jakarta.validation.Valid;
import org.example.storeapi.domain.user.DadosCadastro;
import org.example.storeapi.domain.user.UserRepository;
import org.example.storeapi.domain.user.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastro dados, UriComponentsBuilder uriComponents){
        var usuario = new Usuario(dados);
        repository.save(usuario);

        var uri = uriComponents.path("/user/{id}").buildAndExpand(usuario.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosCadastro(dados));
    }


}
