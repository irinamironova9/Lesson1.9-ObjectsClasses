public class App {
    public static void main(String[] args) {
        Author janeAusten = new Author("Jane", "Austen");
        System.out.println(janeAusten);

        Book prideAndPrejudice = new Book("Pride and Prejudice", janeAusten, 2015);
        System.out.println(prideAndPrejudice);

        Book emma = new Book("Emma", janeAusten, 2022);
        System.out.println(emma);

        Author yuvalHarari = new Author("Yuval Noah", "Harari");
        System.out.println(yuvalHarari);

        Book sapiens = new Book("Sapiens: A Brief History of Humankind", yuvalHarari, 2017);
        System.out.println(sapiens);

        Book lessons21 = new Book("21 Lessons for the 21st Century", yuvalHarari, 2021);
        System.out.println(lessons21);

        lessons21.setPublishingYear(2022);
        System.out.println(lessons21);

        Author jane = new Author("Jane", "Russel");
        jane.compareAndDisplay(janeAusten);

        Author harari = yuvalHarari;
        harari.compareAndDisplay(yuvalHarari);

        Book homoSapiens = new Book("Sapiens: A Brief History of Humankind", yuvalHarari, 2020);
        homoSapiens.compareAndDisplay(sapiens);

        emma.compareAndDisplay(lessons21);
    }
}