package nickdg.Esercizio1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class InfoRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Esercizio 1");
        System.out.println("-------------------");
        Info info = new Info();
        info.setNome("Nick");
        info.setCognome("DG");
        info.setDataNascita(new Date(98, 1, 18));

        DataSource dataSource = new infoAdapter(info);
        UserData userData = new UserData();
        userData.getData(dataSource);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Eta: " + userData.getEta());


    }
}
