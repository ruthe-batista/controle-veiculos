package br.com.controle.veiculos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioSaida {

    @JsonProperty("id_usuario")
    private Integer idUsuario;

    @JsonProperty("nome_completo")
    private String nomeCompleto;

    @JsonProperty("email")
    private String email;

    @JsonProperty("cpf")
    private Long cpf;

    @JsonProperty("data_nascimento")
    private String dataNascimento;


    public UsuarioSaida() {
    }

    public UsuarioSaida(Integer idUsuario, String nomeCompleto, String email, Long cpf, String dataNascimento) {
        this.idUsuario = idUsuario;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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
