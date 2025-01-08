package br.com.ebiblia.repository;


import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ebiblia.model.Capitulo;

@Repository
public interface CapituloRepository extends JpaRepository<Capitulo, UUID> {
    
  

    
}
