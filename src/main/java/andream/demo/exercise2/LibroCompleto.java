package andream.demo.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class LibroCompleto {
    private List<Libro> contenutoTotale = new ArrayList<>();

    public void stampa() {
        for (int i = 0; i < contenutoTotale.size(); i++) {
            Libro element = contenutoTotale.get(i);
            element.stampa();
        }
    }

    public int numbPagine() {
        int t = 0;
        for (int i = 0; i < contenutoTotale.size(); i++) {
            Libro element = contenutoTotale.get(i);
            t += element.numbPagine();
        }
        return t;
    }

//    public void addSezione(Libro... roba){
//        this.contenutoTotale.add(roba);
//    }

}
