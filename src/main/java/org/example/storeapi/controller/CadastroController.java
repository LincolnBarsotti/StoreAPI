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

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastro){
        repository.save(new Usuario(DadosCadastro));
        return ResponseEntity.created().build();
    }


}
