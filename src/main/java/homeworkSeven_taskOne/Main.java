package homeworkSeven_taskOne;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Хоббит", "Толкин","фэнтези" );
        Book book2 = new Book("Убийство в Восточном экспрессе", "Кристи","детектив" );
        Book book3 = new Book("Приключения Шерлока Холмса", "Дойл","детектив" );
        Book book4 = new Book("Унесенные ветром", "Митчелл","роман" );

        Reader reader = new Reader("Максим Петров");
        Librarian librarian = new Librarian("Елена Степановна");

        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);
        librarian.addBook(book4);

        reader.borrowBook(book1);
        librarian.checkActivity("Хоббит");
        reader.borrowBook(book1);
        reader.returnBook();
        librarian.checkActivity("Хоббит");
        reader.performAction();
        librarian.performAction();



    }
}
