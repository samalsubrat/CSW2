class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop Model: " + model + ", Price: $" + price;
    }
}

public class laptopMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        //The toString() method in the Laptop class returns a string representation 
        //of its model and price. In the Main class, invoking toString() on the laptop 
        //object automatically utilizes the overridden method to print concise details, 
        //eliminating the need for explicit getter calls.
        laptop.setModel("Framework 16");
        laptop.setPrice(5000);
        System.out.println(laptop.toString());
    }
}

