import java.util.Objects;
public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(this.title, book.title)
                && Objects.equals(this.author, book.author)
                && this.year == book.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public String toString() {
        return title + " - " + author + " - " + year;
    }
}
