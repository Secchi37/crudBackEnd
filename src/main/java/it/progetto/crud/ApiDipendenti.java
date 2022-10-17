package it.progetto.crud;

import it.progetto.crud.model.Dipendente;
import it.progetto.crud.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/dipendenti")
public class ApiDipendenti {
    @Autowired
    DipendenteService dipendenteService;

    @GetMapping("/all")
    public List<Dipendente> getAllDipendenti() {
        return dipendenteService.findAllDipendente();
    }


    @GetMapping("/find/{id}")
    public Dipendente getDipendenteById(@PathVariable("id") Long id){
        return dipendenteService.findDipendenteById(id);
    }

    @PostMapping("/add")
    public Dipendente addDipendente(@RequestBody Dipendente dipendente){
        return dipendenteService.addDipendente(dipendente);
    }

@PutMapping("/update")
    public Dipendente updateDipendente(@RequestBody Dipendente dipendente){
        return dipendenteService.updateDipendente(dipendente);
}
@Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteDipendente(@PathVariable("id") Long id){
        dipendenteService.deleteDipendente(id);
        return new ResponseEntity<>(HttpStatus.OK);
}

}
