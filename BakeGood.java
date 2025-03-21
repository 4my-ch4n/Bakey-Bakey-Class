public class BakeGood {
    protected String name;
    protected double price;
    protected int quantity;

    public BakeGood(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity Available: " + quantity);
    }

    public void updateQuantity(int amount) {
        if (quantity + amount >= 0) {
            quantity += amount;
            System.out.println("Updated quantity: " + quantity);
        } else {
            System.out.println("Insufficient stock.");
        }
    }

    public double calculateTotalCost(int numberOfItems) {
        return price * numberOfItems;
    }
}
