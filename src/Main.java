public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("Назад дороги нет", "Александр", "2013");
        Book book1 = new Book.NonFictionBook("Кто ты,воин?", "Мемон", "2017");
        Book book2 = new Book("Начни сейчас зарабатывать свои перве миллионы", "Безнес", "2230");
        Book book3 = new Book.FictionBook("Вспомни", "Некто", "2009");
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.issueBook(book);
        library.findBooksByGenre(Genre.FICTION);
        library.printBooks();
        library.issueBook(book);
        library.returnBook(book);
        library.printBooks();
        Library.LibraryHelper.findBookByTitle("Кто ты,воин?", library);
    }
}
