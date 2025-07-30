package andream.demo.exercise3;

import lombok.Getter;

@Getter
public class Tenente extends Militare {
    private int stipendio = 1000;
    private String grado = "tenente";
    private Militare next;
}
