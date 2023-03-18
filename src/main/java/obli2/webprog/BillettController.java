package obli2.webprog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/")
public class BillettController {

    @Autowired
    BillettRepository repository;

    /*Lagre: tar imot en Kinobilletter-objekt og legger den til i databasen vha.
    BillettRepository-objektet.
     */
 @PostMapping("/bestill")
    public void lagre(@RequestBody Kinobilletter billett) {
        repository.leggTilBillett(billett);
    }


    /*
    Henter alle kinobillettene fra databasen vha. BillettRepository og returnerer
    dem som en liste.
     */
    @GetMapping("/hent")
    public List<Kinobilletter> hent() {
        return repository.hentAlleBilletter();
    }

    /*
    Sletter alle kinobillettene fra databasen vha. BillettRepository.
     */

  @DeleteMapping("/slett")
    public void slett() {
        repository.slettAlleBilletter();
    }
}







