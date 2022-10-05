public class App {
    public static void main(String[] args) {
        Author janeAusten = new Author("Jane", "Austen");

        Book prideAndPrejudice = new Book("Pride and Prejudice", janeAusten, 2015);
        displayBookInfo(prideAndPrejudice);

        Book emma = new Book("Emma", janeAusten, 2022);
        displayBookInfo(emma);

        Author yuvalHarari = new Author("Yuval Noah", "Harari");

        Book sapiens = new Book("Sapiens: A Brief History of Humankind", yuvalHarari, 2017);
        displayBookInfo(sapiens);

        Book lessons21 = new Book("21 Lessons for the 21st Century", yuvalHarari, 2021);
        displayBookInfo(lessons21);

        lessons21.setPublishingYear(2022);
        displayBookInfo(lessons21);
    }

    public static void displayBookInfo(Book book) {
        System.out.printf("Title: " + book.getBookName() + "%n"
                + "Author: " + book.getBookAuthor().getAuthorFullName() + "%n"
                + "Published in: " + book.getPublishingYear() + "%n" + "%n");
    }
}