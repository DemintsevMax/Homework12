public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Песнь льда и огня", 1996);
        Author author1 = new Author("Джордж", "Мартин");
        System.out.println("book1.getBookName() = " + book1.getBookName());
        System.out.println("book1.getYearPublic() = " + book1.getYearPublic());
        System.out.println("author1.getFirsName() = " + author1.getFirsName());
        System.out.println("author1.getLastName() = " + author1.getLastName());

        System.out.println("");

        Book book2 = new Book("Гордость и предубеждение", 1813);
        Author author2 = new Author("Джейн", "Остин");
        System.out.println("book1.getBookName() = " + book2.getBookName());
        System.out.println("book1.getYearPublic() = " + book2.getYearPublic());
        System.out.println("author1.getFirsName() = " + author2.getFirsName());
        System.out.println("author1.getLastName() = " + author2.getLastName());

        book2.setYearPublic(2024);
        System.out.println("book2.getYearPublic() = " + book2.getYearPublic());
    }
}