package obli2.webprog;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BillettRepository {
    private List<Kinobilletter> billetter;

    public BillettRepository() {
        this.billetter = new ArrayList<>();
    }

    public void leggTilBillett(Kinobilletter billett) {
        billetter.add(billett);
    }

    public List<Kinobilletter> hentAlleBilletter() {
        return billetter;
    }

    public void slettAlleBilletter() {
        billetter.clear();
    }

}


