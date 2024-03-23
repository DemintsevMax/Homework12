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
}
