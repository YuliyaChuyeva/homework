package homeWorkSixteen;

public class Book {
    private String title;
    private String[] pages;

    public Book(String title, String[] pages) {
        this.title = title;
        this.pages = pages;
    }

    class Page {
        public void printPage(int pageNumber) {
            if (pageNumber >= 0 && pageNumber < pages.length) {
                System.out.println(String.format("Книга: %s", title));
                System.out.println(String.format("Страница: %d", (pageNumber + 1)));
                System.out.println(String.format("Текст: %s", pages[pageNumber]));
            } else {
                System.out.println("Такой страницы нет");
            }
        }
    }

    public static void main(String[] args) {
        String[] bookPages = {"Содержание первой страницы", "Содержание второй страницы", "Содержание третей страниицы"};
        Book book = new Book("Гарри Поттер", bookPages);
        Book.Page page = book.new Page();
        page.printPage(0);
        page.printPage(1);
        page.printPage(2);
    }
}

