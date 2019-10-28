package models;

public class Book {

    //IMPRIME O NOME DOS LIVROS

    private String title;

        public String getTitle()
        {
            return title;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

    //INCREMENTA O NUMERO DA VERSAO DO LIVRO

    public int versao = 1;

        public void Incremento()
        {
            versao++;
        }

        public int getVersao()
        {
            return versao;
        }

        //CONSTRUTOR IMPRIME NUMERO DE PAGINAS

    private int pag;

        public Book(int pag)
        {
            this.pag = pag;
        }

        public int getPag()
        {
            return pag;
        }

        //AUTOR


}
