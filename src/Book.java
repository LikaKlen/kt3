enum Genre {
    FICTION,
    NON_FICTION
}
public class Book  implements Readable {
    private String name, author, yearOfPublishing;
    public Book(String name, String author, String yearOfPublishing){
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;

    }
    @Override
    public void read(){
        System.out.println("Читаем книгу: " + name);
    }
    public static class FictionBook extends Book{
        FictionBook(String name, String author, String yearOfPublishing){
            super(name, author, yearOfPublishing);
        }

        public void read(){
            System.out.println("Читаем 'Fiction' книгу: " + super.name);
        }
    }
    public static class NonFictionBook extends Book{
        NonFictionBook(String name, String author, String yearOfPublishing){
            super(name, author, yearOfPublishing);
        }
        @Override
        public void read(){
            System.out.println("Читаем 'NonFiction' книгу: " + super.name);
        }
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYearOfPublishing() {
        return yearOfPublishing;
    }
    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
