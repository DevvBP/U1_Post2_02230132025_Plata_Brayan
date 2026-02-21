package strategy;

public class MemberDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.90; 
    }
}
