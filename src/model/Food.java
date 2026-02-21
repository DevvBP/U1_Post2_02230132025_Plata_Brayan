package model;

public class Food extends Product {
    private int daysToExpire;

    public Food(String name, double price, int daysToExpire) {
        super(name, price, "Food");
        this.daysToExpire = daysToExpire;
    }

    @Override
    public double calculateShipping() { 
        return 2.0; // Envío económico para comida
    }

    @Override
    public String getDescription() {
        return name + " [Comida] - Vence en: " + daysToExpire + " días";
    }
}
