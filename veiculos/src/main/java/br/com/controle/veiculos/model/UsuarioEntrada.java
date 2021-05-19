package br.com.controle.veiculos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuarioEntrada {

    @NotBlank
    @JsonProperty("nome_completo")
    private String nomeCompleto;

    @NotBlank
    @Email
    @JsonProperty("email")
    private String email;

    @NotBlank
    @CPF
    @JsonProperty("cpf")
    private Long cpf;

    @NotBlank
    @JsonProperty("data_nascimento")
    private String dataNascimento;

    public UsuarioEntrada() {
    }

    public UsuarioEntrada(String nomeCompleto, String email, Long cpf, String dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
