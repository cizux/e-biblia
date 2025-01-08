package br.com.ebiblia.Service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.ebiblia.model.Biblia;
import br.com.ebiblia.repository.BibliaRepository;

@Service
public class BibliaService {
    

    private BibliaRepository bibliaRepository;

    public BibliaService(BibliaRepository bibliaRepository) {
        this.bibliaRepository = bibliaRepository;
    }

    public Biblia save(Biblia biblia) {
        return bibliaRepository.save(biblia);
    }

    public void delete(Biblia biblia) {
        bibliaRepository.delete(biblia);
    }

    public Biblia findById(UUID id) {
        return bibliaRepository.findById(id).get();
    }

    public Iterable<Biblia> findAll() {
        return bibliaRepository.findAll();
    }
}
