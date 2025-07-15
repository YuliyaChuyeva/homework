package homeworkSeven_taskOne;

public class Librarian extends Person{

    private Book book1,book2,book3,book4;

    public Librarian(String name) {
        super(name);
        this.book1=null;
        this.book2=null;
        this.book3=null;
        this.book4=null;
    }

    public void addBook(Book book){
        if(book1==null){
            book1=book;
            System.out.println("Библиотекарь добавил " + book.getTitle());
        }
        else if (book2==null){
            book2 = book;
            System.out.println("Билиотекарь добавил " + book.getTitle());
        }
        else if(book3==null){
            book3=book;
            System.out.println("Библиотекарь добавил " + book.getTitle());
        }
        else if (book4==null){
            book4=book;
            System.out.println("Библиотекарь добавил " + book.getTitle());
        }
        else {
            System.out.println("Библиотека заполнена");
        }
    }

    public void checkActivity(String title) {
        if (book1 != null && book1.getTitle().equals(title)) {
            System.out.println("Книга '" + title + "' доступна: " + book1.isActive());
        } else if (book2 != null && book2.getTitle().equals(title)) {
            System.out.println("Книга '" + title + "' доступна: " + book2.isActive());
        } else if (book3 != null && book3.getTitle().equals(title)) {
            System.out.println("Книга '" + title + "' доступна: " + book3.isActive());
        } else  if(book4 !=null && book4.getTitle().equals(title)){
            System.out.println("Книга" + title + " доступна: " + book4.isActive());
        }
        else {
            System.out.println("Книга '" + title + "' не найдена в библиотеке.");
        }
    }

    @Override
    public void performAction() {
            System.out.println("Библиотекарь проверяет состояние книг:");
            if (book1 != null){ System.out.println(book1);}
            else if (book2 != null){ System.out.println(book2);}
            else if (book3 != null){ System.out.println(book3);}
            else if (book4 !=null){ System.out.println(book4);}
    }

}
