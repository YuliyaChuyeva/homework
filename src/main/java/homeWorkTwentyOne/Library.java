package homeWorkTwentyOne;

import java.lang.reflect.Field;

class Book {
    private String title = "Алиса в стране чудес";
}

public class Library {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Book book = new Book();
        Class<?> bookClass = book.getClass();
        Field field = bookClass.getDeclaredField("title");
        field.setAccessible(true);
        System.out.println("Начальное значение:" + field.get(book));
        field.set(book, "Гарри Поттер");
        System.out.println("Измененное значение:" + field.get(book));
    }
}
