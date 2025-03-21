public class Pastry extends BakeGood {
    private String filling;

    public Pastry(String name, double price, int quantity, String filling) {
        super(name, price, quantity);
        this.filling = filling;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Filling: " + filling);
    }
}
