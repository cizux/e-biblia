package br.com.ebiblia.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ebiblia.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, UUID> {
    
 
    
}
