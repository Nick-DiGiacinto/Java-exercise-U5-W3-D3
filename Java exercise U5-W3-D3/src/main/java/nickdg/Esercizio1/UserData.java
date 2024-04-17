package nickdg.Esercizio1;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource dataSource) {
        nomeCompleto = dataSource.getNomeCompleto();
        eta = dataSource.getEta();
    }
}
