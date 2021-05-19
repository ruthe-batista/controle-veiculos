package br.com.controle.veiculos.service;

import br.com.controle.veiculos.entity.VeiculoEntity;
import br.com.controle.veiculos.model.VeiculoEntrada;
import br.com.controle.veiculos.model.VeiculoSaida;
import br.com.controle.veiculos.parser.VeiculoParser;
import br.com.controle.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    @Autowired
    VeiculoParser veiculoParser;

    public VeiculoSaida save(VeiculoEntrada veiculoEntrada) {
        VeiculoEntity veiculoEntity = veiculoParser.parser(veiculoEntrada);
        return veiculoParser.parser(veiculoRepository.save(veiculoEntity));
    }

    public List<VeiculoSaida> findAll() {
        Optional<List<VeiculoEntity>> optionalVeiculos = Optional.of(veiculoRepository.findAll());
        List<VeiculoSaida> veiculos = new ArrayList<>();
        if (optionalVeiculos.isPresent()) {
            for (VeiculoEntity veiculoEntity : optionalVeiculos.get()) {
                veiculos.add(veiculoParser.parser(veiculoEntity));
            }
        }
        return veiculos;
    }

}
