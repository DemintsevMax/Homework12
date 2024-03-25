public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Мартин", "Джордж");
        Book book1 = new Book("Песнь льда и огня", 1996,author1);
        System.out.println("Название книги: " + book1.getBookName());
        System.out.println("Год публикации: " + book1.getYearPublic());
        System.out.println("Автор: " + book1.getAuthor());

        System.out.println("");

        Author author2 = new Author("Остин", "Джейн");
        Book book2 = new Book("Гордость и Предубеждение", 1813, author2);
        System.out.println("Название книги: " + book2.getBookName());
        System.out.println("Год публикации: " + book2.getYearPublic());
        System.out.println("Автор: " + book2.getAuthor());



        book2.setYearPublic(2024);
        System.out.println("Год публикации: = " + book2.getYearPublic());
    }
}