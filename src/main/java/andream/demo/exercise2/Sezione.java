package andream.demo.exercise2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class Sezione implements Libro {
    private List<Libro> sottoSezioni = new ArrayList<>();

    @Override
    public void stampa() {
        for (int i = 0; i < sottoSezioni.size(); i++) {
            Libro e = sottoSezioni.get(i);
            System.out.println(e);
        }
    }

    @Override
    public int numbPagine() {
        int totale = 0;
        for (int i = 0; i < sottoSezioni.size(); i++) {
            totale += sottoSezioni.get(i).numbPagine();
        }
        return totale;
    }


    public void addSezione(Libro roba) {
        this.sottoSezioni.add(roba);
    }
}


