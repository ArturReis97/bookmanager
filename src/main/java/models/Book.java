package models;

public class Book {

    private String title;

        public String getTitle()
        {
            return title;
        }

        public void setTitle(String title)
        {
            this.title = title;
        }

    public int versao = 1;

        public void Incremento()
        {
            versao++;
        }

    public int getVersao()
    {
        return versao;
    }
}
