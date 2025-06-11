public class Product {
public String name;
public double price;
public int quantity;

    public Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }
    public Product(String x, double y) {
        name = x;
        price = y;
        quantity = 0;
    }
public double getPrice(){
return this.price;
}
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int z) {
        this.quantity = z;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
    }
    public void displayInfo(boolean a) {
        System.out.println("Product Name: " + this.name);
        System.out.println("Price: $" + this.price);
            System.out.println("Quantity: " + this.quantity);
    }
}
