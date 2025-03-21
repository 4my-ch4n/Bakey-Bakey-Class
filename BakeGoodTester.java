public class BakeGoodTester {
    public static void main(String[] args) {
        Cake cake = new Cake("Chocolate Cake", 15.99, 10, "Chocolate");
        Bread bread = new Bread("Whole Wheat Bread", 5.49, 20, true);
        Pastry pastry = new Pastry("Apple Turnover", 3.99, 15, "Apple");

        cake.displayInfo();
        System.out.println("Total Cost for 3 Cakes: $" + cake.calculateTotalCost(3));
        cake.updateQuantity(-3);

        System.out.println();
        bread.displayInfo();
        bread.updateQuantity(5);

        System.out.println();
        pastry.displayInfo();
        System.out.println("Total Cost for 5 Pastries: $ " + String.format("%.2f" , pastry.calculateTotalCost(5)));
        pastry.updateQuantity(-5);
    }
}
