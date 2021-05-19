package br.com.controle.veiculos.parser;

import br.com.controle.veiculos.entity.VeiculoEntity;
import br.com.controle.veiculos.model.VeiculoEntrada;
import br.com.controle.veiculos.model.VeiculoSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VeiculoParser {

    @Autowired
    private UsuarioParser usuarioParser;

    public VeiculoEntity parser(VeiculoEntrada veiculoEntrada) {
        if (veiculoEntrada == null) {
            return null;
        }
        VeiculoEntity veiculoEntity = new VeiculoEntity();
        veiculoEntity.setAno(veiculoEntrada.getAno());
        veiculoEntity.setMarca(veiculoEntrada.getMarca());
        veiculoEntity.setModelo(veiculoEntrada.getModelo());
        veiculoEntity.setUsuarioEntity(usuarioParser.parser(veiculoEntrada.getUsuarioEntrada()));
        return veiculoEntity;
    }


    public VeiculoSaida parser(VeiculoEntity veiculoEntity) {
        if (veiculoEntity == null) {
            return null;
        }
        VeiculoSaida veiculoSaida = new VeiculoSaida();
        veiculoSaida.setIdVeiculo(veiculoEntity.getIdVeiculo());
        veiculoSaida.setAno(veiculoEntity.getAno());
        veiculoSaida.setMarca(veiculoEntity.getMarca());
        veiculoSaida.setModelo(veiculoEntity.getModelo());
        veiculoSaida.setUsuarioSaida(usuarioParser.parser(veiculoEntity.getUsuarioEntity()));
        return veiculoSaida;
    }

}
