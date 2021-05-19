package br.com.controle.veiculos.parser;

import br.com.controle.veiculos.entity.UsuarioEntity;
import br.com.controle.veiculos.model.UsuarioEntrada;
import br.com.controle.veiculos.model.UsuarioSaida;
import org.springframework.stereotype.Component;

@Component
public class UsuarioParser {

    public UsuarioEntity parser(UsuarioEntrada usuarioEntrada) {
        if (usuarioEntrada == null) {
            return null;
        }

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNomeCompleto(usuarioEntrada.getNomeCompleto());
        usuarioEntity.setEmail(usuarioEntrada.getEmail());
        usuarioEntity.setCpf(String.valueOf(usuarioEntrada.getCpf()));
        usuarioEntity.setDataNascimento(usuarioEntrada.getDataNascimento());
        return usuarioEntity;
    }


    public UsuarioSaida parser(UsuarioEntity usuarioEntity) {
        if (usuarioEntity == null) {
            return null;
        }

        UsuarioSaida usuarioSaida = new UsuarioSaida();
        usuarioSaida.setIdUsuario(usuarioEntity.getIdUsuario());
        usuarioSaida.setNomeCompleto(usuarioEntity.getNomeCompleto());
        usuarioSaida.setEmail(usuarioEntity.getEmail());
        usuarioSaida.setCpf(Long.parseLong(usuarioEntity.getCpf()));
        usuarioSaida.setDataNascimento(usuarioEntity.getDataNascimento());
        return usuarioSaida;
    }

}
