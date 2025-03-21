public class Cake extends BakeGood {
    private String flavor;

    public Cake(String name, double price, int quantity, String flavor) {
        super(name, price, quantity);
        this.flavor = flavor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Flavor: " + flavor);
    }
}
