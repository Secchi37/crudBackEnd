package it.progetto.crud.repository;

import it.progetto.crud.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {

    Optional<Dipendente> findDipendenteById(Long id);
    void deleteDipendenteById(Long id);


}
