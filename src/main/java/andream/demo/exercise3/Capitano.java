package andream.demo.exercise3;

import lombok.Getter;

@Getter
public class Capitano extends Militare {
    private int stipendio = 2000;
    private String grado = "capitano";
    private Militare next;
}
