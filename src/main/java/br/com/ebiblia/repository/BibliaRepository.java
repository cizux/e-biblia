package br.com.ebiblia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ebiblia.model.Biblia;
import br.com.ebiblia.model.enums.Idioma;

import java.util.UUID;
import java.util.List;


@Repository
public interface BibliaRepository extends JpaRepository<Biblia, UUID> {
    
    Biblia findBibliaByNome(String nome);
    
    
    List<Biblia> findBibliaBySigla(String sigla);

    List<Biblia> findBibliaByIdioma(Idioma idioma);

    List<Biblia> findBibliaByNomeContaining(String nome);

    
    
}
