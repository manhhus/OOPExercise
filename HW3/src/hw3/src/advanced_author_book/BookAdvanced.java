package hw3.src.advanced_author_book;

public class BookAdvanced {
	private final String name;
    private final Author[] authors;
    private double price;
    private int qty;

    public BookAdvanced(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }

    public BookAdvanced(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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
        String authorsStr = "{";
        for (int i = 0; i < authors.length; i++) {
            authorsStr += authors[i].toString();
            if (i == authors.length - 1)
                authorsStr += "}";
            else
                authorsStr += ", ";
        }
        return "Book[name = " + name + ", " + authorsStr
                + ", price = " + price + ", qty = " + qty + "]";
    }

    public String getAuthorNames() {
        String res = "";
        for (int i = 0; i < authors.length; i++) {
            res += authors[i].getName();
            if (i != authors.length - 1)
                res += ", ";
        }
        return res;
    }

}
