package andream.demo.exercise1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        UserData us = new UserData("andym", 30);
        System.out.println(us);

        Info info1 = new Info("andy", "test", LocalDate.of(1995, 4, 3));
        System.out.println(info1);

        InfoAdapter adapter = new InfoAdapter(info1);
        adapter.getEta();

    }
}
