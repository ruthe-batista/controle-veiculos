package br.com.controle.veiculos.controller;

import br.com.controle.veiculos.model.VeiculoEntrada;
import br.com.controle.veiculos.model.VeiculoSaida;
import br.com.controle.veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<VeiculoSaida> save(@RequestBody VeiculoEntrada veiculoEntrada) {
        VeiculoSaida veiculoSaida = veiculoService.save(veiculoEntrada);
        if (veiculoSaida == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.created(URI.create("http://localhost:8080/veiculo")).body(veiculoSaida);
    }

    @GetMapping("/findall")
    public List<VeiculoSaida> findAll() {
        return veiculoService.findAll();
    }

}
