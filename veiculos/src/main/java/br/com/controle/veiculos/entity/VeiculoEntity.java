package br.com.controle.veiculos.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "veiculo")
public class VeiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veiculo")
    private Integer idVeiculo;

    @Basic(optional = false)
    @NotBlank
    @Column(name = "modelo")
    private String modelo;

    @Basic(optional = false)
    @NotBlank
    @Column(name = "marca")
    private String marca;

    @Basic(optional = false)
    @NotBlank
    @Column(name = "ano")
    private String ano;

    @ManyToOne(cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuario_carro", referencedColumnName = "id_usuario")
    UsuarioEntity usuarioEntity;


    public VeiculoEntity() {
    }

    public VeiculoEntity(Integer idVeiculo, String modelo, String marca, String ano, UsuarioEntity usuarioEntity) {
        this.idVeiculo = idVeiculo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.usuarioEntity = usuarioEntity;
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

    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }

    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }
}
