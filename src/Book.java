public class Book {
    private String bookName;
    private int yearPublic;

    public Book(String bookName, int yearPublic){
        this.bookName = bookName;
        this.yearPublic = yearPublic;
    }

    public String getBookName(){
        return this.bookName;
    }
    public int getYearPublic(){
        return this.yearPublic;
    }
    public void setYearPublic(int yearPublic){
        this.yearPublic=yearPublic;
    }
}
