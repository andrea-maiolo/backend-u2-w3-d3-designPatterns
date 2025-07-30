package andream.demo.exercise3;

import lombok.Getter;

@Getter
public class Maggiore extends Militare {
    private int stipendio = 3000;
    private String grado = "maggiore";
    private Militare next;
}
