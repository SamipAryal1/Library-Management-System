package Models;

public class BookQuantity {
    private String bookName;
    private int quantity;

    public BookQuantity(String bookName, int quantity) {
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
