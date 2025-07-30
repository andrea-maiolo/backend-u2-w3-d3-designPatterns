package andream.demo.exercise2;

import java.util.ArrayList;
import java.util.List;

public class LibroCompleto {
    private List<Libro> contenutoTotale = new ArrayList<>();

    public void stampaLibroCompleto() {
        for (int i = 0; i < contenutoTotale.size(); i++) {
            Libro element = contenutoTotale.get(i);
            element.stampa();
        }
    }

    public int totalePagine() {
        int t = 0;
        for (int i = 0; i < contenutoTotale.size(); i++) {
            Libro element = contenutoTotale.get(i);
            t += element.numbPagine();
        }
        return t;
    }

}
