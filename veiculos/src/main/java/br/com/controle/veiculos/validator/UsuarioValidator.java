package br.com.controle.veiculos.validator;

import br.com.controle.veiculos.model.UsuarioEntrada;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UsuarioValidator {

    public String validarDataNascimentoUsuario(UsuarioEntrada usuarioEntrada) {
        usuarioEntrada.setDataNascimento(usuarioEntrada.getDataNascimento());
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dataFormatada.parse(usuarioEntrada.getDataNascimento());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat data = new SimpleDateFormat("dd.MMMM.yyyy");
        String dataF = data.format(date);
        return dataF;
    }

}



