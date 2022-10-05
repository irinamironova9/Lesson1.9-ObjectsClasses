public class App {
    public static void main(String[] args) {
        Author janeAusten = new Author("Jane", "Austen");

        Book prideAndPrejudice = new Book("Pride and Prejudice", janeAusten, 2015);
        bookInfoDisplay(prideAndPrejudice);

        Book emma = new Book("Emma", janeAusten, 2022);
        bookInfoDisplay(emma);

        Author yuvalHarari = new Author("Yuval Noah", "Harari");

        Book sapiens = new Book("Sapiens: A Brief History of Humankind", yuvalHarari, 2017);
        bookInfoDisplay(sapiens);

        Book lessons21 = new Book("21 Lessons for the 21st Century", yuvalHarari, 2021);
        bookInfoDisplay(lessons21);

        lessons21.setPublishingYear(2022);
        bookInfoDisplay(lessons21);
    }

    public static void bookInfoDisplay(Book book) {
        System.out.printf("Title: " + book.getBookName() + "%n"
                + "Author: " + book.getBookAuthor().getAuthorFullName() + "%n"
                + "Published in: " + book.getPublishingYear() + "%n" + "%n");
    }
}