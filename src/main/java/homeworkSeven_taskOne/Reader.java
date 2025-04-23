package homeworkSeven_taskOne;

public class Reader extends Person {
    private Book borrowBook;

    public Reader(String name) {
        super(name);
        this.borrowBook = null;
    }


    public void borrowBook(Book book) {

        if (book.isActive()) {
            book.setActive(false);
            borrowBook = book;
            System.out.println(getName() + "  взял книгу: " + book.getTitle());
        } else {
            System.out.println("Книга '" + book.getTitle() + "' недоступна для выдачи.");
        }
    }


    public void returnBook() {
        if (borrowBook != null) {
            borrowBook.setActive(true);
            System.out.println(getName() + " вернул книгу: " + borrowBook.getTitle());
            borrowBook = null; // У читателя больше нет книги
        } else {
            System.out.println("У вас нет книг, чтобы вернуть.");
        }
    }

    @Override
    public void performAction() {
        if (borrowBook != null) {
            System.out.println(getName() + " читает книгу: " + borrowBook.getTitle());
        } else {
            System.out.println(getName() + " не читает никакую книгу.");
        }
    }


}