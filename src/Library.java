import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга добавлена в библиотеку: " + book.getName());
    }
    public void issueBook(Book book) {
        try {
            if (books.contains(book)) {
                books.remove(book);
                System.out.println("Книга выдана: " + book.getName());
            } else {
                throw new
                        BookUnavailableException("Книги нет в наличии: " + book.getName());
            }
        }catch(BookUnavailableException e){
            System.out.println(e.getMessage());
        }
    }
    public void returnBook(Book book) {
        try {
            books.add(book);
            System.out.println("Книга возвращена в библиотеку: " + book.getName());
        }catch (Exception e){
            System.out.println("Произошла ошибка при возврате книги");
        }
    }
    public void printBooks() {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
    public void findBooksByGenre(Genre genre) {
        for (Book book : books) {
            if (book instanceof Book.FictionBook && genre == Genre.FICTION) {
                System.out.println(book.getName() + " - FICTION книга.");
            } else if (book instanceof Book.NonFictionBook && genre == Genre.NON_FICTION) {
                System.out.println(book.getName() + " - NON_FICTION книга.");
            }
        }
    }
    static class LibraryHelper {
        public static Book findBookByTitle(String name, Library library) {
            for (Book book : library.books) {
                if (book.getName().equals(name)) {
                    return book;
                }
            }
            return null;
        }
    }
}
