package andream.demo.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Pagina implements Libro {
    private String contenuto;

    @Override
    public void stampa() {
        System.out.println(this.contenuto);
    }

    @Override
    public int numbPagine() {
        return 1;
    }
}
