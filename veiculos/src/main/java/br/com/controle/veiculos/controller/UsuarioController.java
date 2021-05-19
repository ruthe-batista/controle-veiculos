package br.com.controle.veiculos.controller;

import br.com.controle.veiculos.model.UsuarioEntrada;
import br.com.controle.veiculos.model.UsuarioSaida;
import br.com.controle.veiculos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioSaida> save(@RequestBody UsuarioEntrada usuarioEntrada) {
        UsuarioSaida usuarioSaida = usuarioService.save(usuarioEntrada);
        if (usuarioSaida == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.created(URI.create("http://localhost:8080/usuario")).body(usuarioSaida);
    }

    @GetMapping("/findall")
    public List<UsuarioSaida> findAll() {
        return usuarioService.findAll();
    }
}


