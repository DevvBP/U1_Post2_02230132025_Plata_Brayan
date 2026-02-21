package strategy;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // Precio normal
    }
}
