package employees;

public class Books {
    private String name;
    private Author author;
    private double price;
    private int quantity;




    public Books(String name, Author author, double price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public void invoiceFrom(){
        System.out.println(  getAuthor().getName() + " sent you an invoice for " + this.getBookInvoice() + "$");
    }

    private double getBookInvoice(){
        return this.price * this.quantity ;
    }

}


