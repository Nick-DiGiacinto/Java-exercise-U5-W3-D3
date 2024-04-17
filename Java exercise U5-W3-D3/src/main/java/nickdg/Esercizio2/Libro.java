package nickdg.Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Elemento {
    private List<Elemento> elementi = new ArrayList<>();
    private List<String> autore;
    private double prezzo;

    public Libro(List<String> autore, double prezzo) {
        this.autore = autore;
        this.prezzo = prezzo;
    }

    @Override
    public int getNumberOfPages() {
        int total = 0;
        for (Elemento elemento : elementi) {
            total += elemento.getNumberOfPages();
        }
        return total;
    }

    public void add(Elemento elemento) {
        elementi.add(elemento);
    }

    @Override
    public void print() {
        System.out.println("Informazioni del libro:");
        System.out.println("Autore/i: " + autore);
        System.out.println("Prezzo: €" + prezzo);
        for (Elemento elemento : elementi) {
            elemento.print();
        }
    }
}
