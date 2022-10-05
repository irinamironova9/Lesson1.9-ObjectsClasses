public class Book {
    private final String bookName;
    private final Author bookAuthor;
    private int publishingYear;

    public Book(String bookName, Author bookAuthor, int publishingYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
