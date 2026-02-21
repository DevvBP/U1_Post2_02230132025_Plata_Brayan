package service;

import model.Order;
import model.Product;
import strategy.DiscountStrategy;

public class OrderService {
    public double calculateTotal(Order order, DiscountStrategy strategy) {
        double total = 0;
        for (Product p : order.getProducts()) {
            double priceWithDiscount = strategy.applyDiscount(p.getBasePrice());
            total += priceWithDiscount + p.calculateShipping();
        }
        return total;
    }
}
