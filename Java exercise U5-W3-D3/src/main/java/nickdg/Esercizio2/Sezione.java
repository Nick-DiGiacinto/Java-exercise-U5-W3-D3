package nickdg.Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Elemento {
    private List<Elemento> elementi = new ArrayList<>();

    @Override
    public int getNumberOfPages() {
        int total = 0;
        for (Elemento element : elementi) {
            total += element.getNumberOfPages();
        }
        return total;
    }
    public void add(Elemento elemento) {
        elementi.add(elemento);
    }

    @Override
    public void print() {
        for (Elemento elemento : elementi) {
            elemento.print();
        }
    }
}
