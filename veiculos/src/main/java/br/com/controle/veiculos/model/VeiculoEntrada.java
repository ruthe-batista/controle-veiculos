package br.com.controle.veiculos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class VeiculoEntrada {

    @NotBlank
    @JsonProperty("modelo")
    private String modelo;

    @NotBlank
    @JsonProperty("marca")
    private String marca;

    @NotBlank
    @JsonProperty("ano")
    private String ano;

    @JsonProperty("id_usuario")
    private UsuarioEntrada usuarioEntrada;


    public VeiculoEntrada() {
    }

    public VeiculoEntrada(String modelo, String marca, String ano, UsuarioEntrada usuarioEntrada) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.usuarioEntrada = usuarioEntrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public UsuarioEntrada getUsuarioEntrada() {
        return usuarioEntrada;
    }

    public void setUsuarioEntrada(UsuarioEntrada usuarioEntrada) {
        this.usuarioEntrada = usuarioEntrada;
    }
}
