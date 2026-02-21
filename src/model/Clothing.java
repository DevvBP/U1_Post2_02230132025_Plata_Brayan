package model;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price, "Clothing");
        this.size = size;
    }

    @Override
    public double calculateShipping() { 
        return 5.0; // Tarifa plana para ropa
    }

    @Override
    public String getDescription() {
        return name + " [Ropa] - Talla: " + size;
    }
}
