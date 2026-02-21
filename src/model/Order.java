package model;

import observer.OrderObserver;
import observer.OrderSubject;
import java.util.ArrayList;
import java.util.List;

public class Order implements OrderSubject {
    private String id;
    private List<Product> products = new ArrayList<>();
    private String status;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
        this.status = "CREATED";
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;
        notifyObservers(id, oldStatus, newStatus);
    }

    @Override
    public void subscribe(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String orderId, String oldStatus, String newStatus) {
        for (OrderObserver observer : observers) {
            observer.update(orderId, oldStatus, newStatus);
        }
    }

    public String getId() { return id; }
    public List<Product> getProducts() { return products; }
    public String getStatus() { return status; }
}
