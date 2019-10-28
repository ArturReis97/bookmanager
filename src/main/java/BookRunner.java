import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        System.out.println("Exercicio 1");

        Book book1 = new Book(100);
        book1.setTitle("The Art Of Computer Programming");
        Book book2 = new Book(75);
        book2.setTitle("Effective Java");
        Book book3 = new Book(60);
        book3.setTitle("Clean Code");

        book1.Incremento();
        book2.Incremento();
        book3.Incremento();
        book3.Incremento();

        System.out.println(String.format( "Name: %s, Versao: %d, %d Paginas", book1.getTitle(), book1.getVersao(), book1.getPag()));
        System.out.println(String.format( "Name: %s, Versao: %d, %d Paginas", book2.getTitle(), book2.getVersao(), book2.getPag()));
        System.out.println(String.format( "Name: %s, Versao: %d, %d Paginas", book3.getTitle(), book3.getVersao(), book3.getPag()));
    }


}
