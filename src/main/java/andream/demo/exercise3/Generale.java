package andream.demo.exercise3;

import lombok.Getter;

@Getter
public class Generale extends Militare {
    private int stipendio = 5000;
    private String grado = "Generale";
    private Militare next;
}

