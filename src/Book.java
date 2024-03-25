import java.util.Objects;

public class Book {
    private String bookName;
    private int yearPublic;
    private Author author;

    public Book(String bookName, int yearPublic, Author author) {
        this.bookName = bookName;
        this.yearPublic = yearPublic;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    @Override
    public String toString() {
        return "Название книги " + bookName + " Год публикации " + yearPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublic == book.yearPublic && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublic);
    }
}




