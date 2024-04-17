package nickdg.Esercizio2;

public class SingolaPagina implements Elemento {
    private int pageNumber;

    public SingolaPagina(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public int getNumberOfPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Print single page " + pageNumber);
    }
}
