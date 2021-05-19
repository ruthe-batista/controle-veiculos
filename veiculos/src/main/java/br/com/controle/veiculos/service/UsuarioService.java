package br.com.controle.veiculos.service;

import br.com.controle.veiculos.entity.UsuarioEntity;
import br.com.controle.veiculos.model.UsuarioEntrada;
import br.com.controle.veiculos.model.UsuarioSaida;
import br.com.controle.veiculos.parser.UsuarioParser;
import br.com.controle.veiculos.repository.UsuarioRepository;
import br.com.controle.veiculos.validator.UsuarioValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioValidator usuarioValidator;

    @Autowired
    UsuarioParser usuarioParser;

    public UsuarioSaida save(UsuarioEntrada usuarioEntrada) {
        usuarioValidator.validarDataNascimentoUsuario(usuarioEntrada);
        UsuarioEntity usuarioEntity = usuarioParser.parser(usuarioEntrada);
        return usuarioParser.parser(usuarioRepository.save(usuarioEntity));
    }

    public List<UsuarioSaida> findAll() {
        Optional<List<UsuarioEntity>> optionalUsuarios = Optional.of(usuarioRepository.findAll());
        List<UsuarioSaida> usuarios = new ArrayList<>();
        if (optionalUsuarios.isPresent()) {
            for (UsuarioEntity usuarioEntity : optionalUsuarios.get()) {
                usuarios.add(usuarioParser.parser(usuarioEntity));
            }
        }
        return usuarios;
    }

}
