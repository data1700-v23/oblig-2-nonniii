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


    @PostMapping("/kinobillett")
    public void lagre(Kinobilletter kinobilletter){
     repository.leggInn(kinobilletter);
    }
    @GetMapping("/kinobillett")
    public ArrayList<Kinobilletter> hent() {
     return repository.hentAlle();
    }

    @DeleteMapping("/kinobillett")
   public void slett() {
 repository.slettAlle();
 }
}










