package br.com.ebiblia.model;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "versiculo")
public class Versiculo implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "numero_versiculo", nullable = false, length = 3)
    private Integer numeroVersiculo;

    @Column(name = "texto_versiculo", columnDefinition = "TEXT")
    private String textoVersiculo;

    // Relacionamento com Capitulo -- Muitos Versiculos para um Capitulo
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capitulo_id")
    private Capitulo capitulo;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getNumeroVersiculo() {
        return numeroVersiculo;
    }

    public void setNumeroVersiculo(Integer numeroVersiculo) {
        this.numeroVersiculo = numeroVersiculo;
    }

    public String getTextoVersiculo() {
        return textoVersiculo;
    }

    public void setTextoVersiculo(String textoVersiculo) {
        this.textoVersiculo = textoVersiculo;
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }















}
