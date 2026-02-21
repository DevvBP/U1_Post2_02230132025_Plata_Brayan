package strategy;

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.50;
    }
}
