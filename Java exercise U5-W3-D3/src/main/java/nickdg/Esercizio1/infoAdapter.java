package nickdg.Esercizio1;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class infoAdapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getCognome() + " " + info.getNome();
    }

    @Override
    public int getEta() {
        Date now = new Date();
        long diff = now.getTime() - info.getDataNascita().getTime();
        long anni = 1000L * 60 * 60 * 24 * 365;
        return (int) (diff / anni);
    }
}
