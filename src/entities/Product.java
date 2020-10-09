package entities;

/**
 *
 * @author 8pg
 */
public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setPrice(double Price) {
        this.price = Price;
    }

    public double totalValueInStock() {
        return this.quantity * this.price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return getName() + ", $ " + String.format("%.2f", getPrice()) + ", " + getQuantity() + " units, Total: $ " + String.format("%.2f", totalValueInStock()) + "\n";
    }
}
