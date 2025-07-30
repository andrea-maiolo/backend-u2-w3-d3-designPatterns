package andream.demo.exercise3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerThird implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {


        // Creazione gerarchia
        Militare tenente = new Tenente();
        Militare capitano = new Capitano();
        Militare maggiore = new Maggiore();
        Militare colonnello = new Colonnello();
        Militare generale = new Generale();

        // Impostazione catena
        tenente.setNext(capitano);
        capitano.setNext(maggiore);
        maggiore.setNext(colonnello);
        colonnello.setNext(generale);

        // Test della catena
        int richiesta1 = 2500;
        System.out.println("Richiesta stipendio >= " + richiesta1);
        tenente.chiPrendeX(richiesta1);

        int richiesta2 = 5000;
        System.out.println("\nRichiesta stipendio >= " + richiesta2);
        tenente.chiPrendeX(richiesta2);

        int richiesta3 = 6000;
        System.out.println("\nRichiesta stipendio >= " + richiesta3);
        tenente.chiPrendeX(richiesta3);

    }
}

