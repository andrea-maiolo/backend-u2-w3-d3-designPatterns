package andream.demo.exercise3;

import lombok.Getter;

@Getter
public class Colonnello extends Militare {
    private int stipendio = 4000;
    private String grado = "colonnello";
    private Militare next;
}
