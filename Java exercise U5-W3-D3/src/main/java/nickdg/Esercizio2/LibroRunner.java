package nickdg.Esercizio2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LibroRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Esercizio 2");
        System.out.println("-------------------");

        Libro libro = new Libro(List.of("Neuromancer", "William Gibson"), 29.99);


        Sezione sezione1 = new Sezione();
        Sezione sezione2 = new Sezione();


        libro.add(sezione1);
        libro.add(new SingolaPagina(1));
        libro.add(new SingolaPagina(2));
        sezione1.add(new SingolaPagina(3));
        sezione1.add(new SingolaPagina(4));

        libro.add(sezione2);
        sezione2.add(new SingolaPagina(5));


        System.out.println("Stampa del libro:");
        libro.print();

        System.out.println("\nStampa della sezione 1:");
        sezione1.print();

        System.out.println("\nStampa della pagina 1:");
        SingolaPagina page1 = new SingolaPagina(1);
        page1.print();


        System.out.println("\nNumero totale di pagine nel libro: " + libro.getNumberOfPages());

    }
}
