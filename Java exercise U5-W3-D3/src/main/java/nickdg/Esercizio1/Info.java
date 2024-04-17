package nickdg.Esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private Date dataNascita;
}
