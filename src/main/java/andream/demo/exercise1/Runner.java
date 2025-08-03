package andream.demo.exercise1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(1)
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Info info1 = new Info("andy", "test", LocalDate.of(1995, 4, 3));
        System.out.println(info1);

        InfoAdapter adapter = new InfoAdapter(info1);
        System.out.println(adapter.getEta());
        System.out.println(adapter.getNomeCompleto());

    }
}
