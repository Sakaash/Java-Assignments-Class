public class Book {
    private String title;
    private String author;
    private int price;

    private static int bookCounter = 0;

    public Book(String title, String author, int price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        bookCounter++;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new NullPointerException("Title cannot be empty");
        else
            this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        if (author == null || author.isEmpty())
            throw new NullPointerException("Author cannot be empty");
        else
            this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        else
            this.price = price;
    }

    public static int getBookCounter() {
        return bookCounter;
    }
}
