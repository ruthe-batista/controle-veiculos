package br.com.controle.veiculos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculoSaida {

    @JsonProperty("id_veiculo")
    private Integer idVeiculo;

    @JsonProperty("modelo")
    private String modelo;

    @JsonProperty("marca")
    private String marca;

    @JsonProperty("ano")
    private String ano;

    @JsonProperty("id_usuario")
    private UsuarioSaida usuarioSaida;

    public VeiculoSaida() {
    }

    public VeiculoSaida(Integer idVeiculo, String modelo, String marca, String ano, UsuarioSaida usuarioSaida) {
        this.idVeiculo = idVeiculo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.usuarioSaida = usuarioSaida;
    }

    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Integer idVeiculo) {
        this.idVeiculo = idVeiculo;
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

    public UsuarioSaida getUsuarioSaida() {
        return usuarioSaida;
    }

    public void setUsuarioSaida(UsuarioSaida usuarioSaida) {
        this.usuarioSaida = usuarioSaida;
    }
}
