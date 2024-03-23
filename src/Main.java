public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж", "Мартин");
        Book book1 = new Book("Песнь льда и огня", 1996,author1);
        System.out.println("Название книги: " + book1.getBookName());
        System.out.println("Год публикации: " + book1.getYearPublic());
        System.out.println("Автор: " + book1.getAuthor().getFirsName() + " " + book1.getAuthor().getLastName());

        System.out.println("");

        Author author2 = new Author("Джейн", "Остин");
        Book book2 = new Book("Гордость и предубеждение", 1813, author2);
        System.out.println("Название книги: = " + book2.getBookName());
        System.out.println("Год публикации: " + book2.getYearPublic());
        System.out.println("Автор: " + book2.getAuthor().getFirsName() + " " + book2.getAuthor().getLastName());

        book2.setYearPublic(2024);
        System.out.println("Год публикации: = " + book2.getYearPublic());
    }
}