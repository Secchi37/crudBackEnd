package it.progetto.crud.repository;

import it.progetto.crud.model.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteRepository extends JpaRepository<Dipendente,Long> {
    Dipendente findDipendenteById(Long id);
    void deleteDipendenteById(Long id);


}
