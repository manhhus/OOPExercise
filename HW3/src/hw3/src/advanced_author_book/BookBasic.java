package hw3.src.advanced_author_book;

public class BookBasic {
	private final String name;
    private final Author author;
    private double price;
    private int qty;

    public BookBasic(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        qty = 0;
    }

    public BookBasic(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name = " + name + ", " + author.toString()
                + ", price = " + price + ", qty = " + qty + "]";
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public Character getAuthorGender() {
        return author.getGender();
    }

}
