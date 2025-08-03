package andream.demo.exercise2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
@Order(2)
public class RunnerSecond implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Supplier<Pagina> paginaSupplier = () -> {
            Pagina newPagina = new Pagina("ciao");
            return newPagina;
        };

        for (int i = 0; i < 8; i++) {
            paginaSupplier.get();
        }
    }
}
