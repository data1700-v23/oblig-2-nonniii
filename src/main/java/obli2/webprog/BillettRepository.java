package obli2.webprog;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BillettRepository {

    private final ArrayList<Kinobilletter> billettListe = new ArrayList<>();

    public void leggInn(Kinobilletter kinobilletter) {
        billettListe.add(kinobilletter);
    }

    public ArrayList<Kinobilletter> hentAlle() {
        return billettListe;
    }
    public void slettAlle() {
    billettListe.clear();
    }
}






