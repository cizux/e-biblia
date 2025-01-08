package br.com.ebiblia.model;

import java.io.Serializable;
import java.util.HashSet;

import java.util.Set;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.ebiblia.model.enums.Idioma;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "biblia")
public class Biblia implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, name = "nome")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "idioma", columnDefinition = "bigint default 0")
    private Set<Idioma> idioma;


    // Relacionamento com Livro
     @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
     @OneToMany(mappedBy = "biblia", fetch = FetchType.LAZY)
     private Set<Livro> livros = new HashSet<>();


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    public UUID getId() {
        return id;
    }


    public void setId(UUID id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSigla() {
        return sigla;
    }


    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public Set<Idioma> getIdioma() {
        return idioma;
    }


    public void setIdioma(Set<Idioma> idioma) {
        this.idioma = idioma;
    }


     public Set<Livro> getLivros() {
          return livros;
      }


     public void setLivros(Set<Livro> livros) {
          this.livros = livros;
      }


    
       
    
}
