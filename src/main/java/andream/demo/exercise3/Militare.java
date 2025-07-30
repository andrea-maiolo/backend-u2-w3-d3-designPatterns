package andream.demo.exercise3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Militare {
    private Militare next;
    private int stipendio;
    private String grado;


    public void chiPrendeX(int importo) {
        if (getStipendio() >= importo) {
            System.out.println(getGrado());
            if (next != null) next.chiPrendeX(importo);
        } else if (getStipendio() < importo && next != null) {
            next.chiPrendeX(importo);
        } else {
            System.out.println("Nessun ufficiale con uno stipendio >= " + importo);
        }
    }

}








