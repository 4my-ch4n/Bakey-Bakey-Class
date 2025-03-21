public class Bread extends BakeGood {
    private boolean isGlutenFree;

    public Bread(String name, double price, int quantity, boolean isGlutenFree) {
        super(name, price, quantity);
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gluten-Free: " + (isGlutenFree ? "Yes" : "No"));
    }
}
