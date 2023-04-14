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


    @PostMapping("/bestill")
    public void lagre(Kinobilletter kinobilletter){
     repository.leggInn(kinobilletter);
    }
    @GetMapping("/hentalle")
    public ArrayList<Kinobilletter> hent() {
     return repository.hentAlle();
    }

    @GetMapping("/slettalle")
   public void slett() {
 repository.slettAlle();
 }
}










