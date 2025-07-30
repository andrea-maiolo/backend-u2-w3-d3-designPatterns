package andream.demo.exercise1;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
public class InfoAdapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        String nomeC = this.info.getNome() + this.info.getCognome();
        return nomeC;
    }

    @Override
    public int getEta() {
        LocalDate targetDate = this.info.getDob();
        int p = Period.between(targetDate, LocalDate.now()).getYears();
        return p;
    }
}
