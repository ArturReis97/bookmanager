import models.Book;

public class BookRunner {

    public static void main(String[] args)
    {
        System.out.println("Exercicio 1");

        Book book1 = new Book();
        book1.setTitle("The Art Of Computer Programming");
        Book book2 = new Book();
        book2.setTitle("Effective Java");
        Book book3 = new Book();
        book3.setTitle("Clean Code");

        book1.Incremento();
        book2.Incremento();
        book3.Incremento();
        book3.Incremento();

        System.out.println(String.format( "Name: %s, Versao: %d", book1.getTitle(), book1.getVersao()));
        System.out.println(String.format( "Name: %s, Versao: %d", book2.getTitle(), book2.getVersao()));
        System.out.println(String.format( "Name: %s, Versao: %d", book3.getTitle(), book3.getVersao()));
    }


}
