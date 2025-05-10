package homeworkSeven_taskOne;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean isActive;

        public Book(String name,String author,String genre){
            this.title = name;
            this.author=author;
            this.genre=genre;
            this.isActive=true;
        }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String toString(){
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", isAvailable=" + isActive +
                '}';
    }
}
