package br.com.ebiblia.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "livro")
public class Livro implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private UUID id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "subtitulo")
    private String subtitulo;


    // Relacionamento com Biblia -- Muitos Livros para uma Biblia
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "biblia_id")
    private Biblia biblia;


    // Relacionamento com Capitulo -- Um Livro para muitos Capitulos
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "livro", fetch = FetchType.LAZY)
    private Set<Capitulo> capitulos = new HashSet<>();


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getSubtitulo() {
        return subtitulo;
    }


    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }


    public Biblia getBiblia() {
        return biblia;
    }


    public void setBiblia(Biblia biblia) {
        this.biblia = biblia;
    }


    public Set<Capitulo> getCapitulos() {
        return capitulos;
    }


    public void setCapitulos(Set<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }


 }