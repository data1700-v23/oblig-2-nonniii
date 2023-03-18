package obli2.webprog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
@RestController
@RequestMapping("/api/kinobilletter")
public class BillettController {

    @Autowired
    BillettRepository repository;

    @PostMapping("/bestill")
    public void lagre(@RequestBody Kinobilletter billett) {
        repository.leggTilBillett(billett);
    }

    @GetMapping("/hent")
    public List<Kinobilletter> hent() {
        return repository.hentAlleBilletter();
    }

    @DeleteMapping("/slett")
    public void slett() {
        repository.slettAlleBilletter();
    }
}





