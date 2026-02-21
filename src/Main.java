import factory.ProductFactory;
import model.*;
import observer.*;
import strategy.*;
import service.OrderService;

public class Main {
    public static void main(String[] args) {
        Product laptop = ProductFactory.createProduct("ELECTRONICS", "Laptop Gamer", 1500.0);
        Product shirt = ProductFactory.createProduct("CLOTHING", "Camiseta Polo", 40.0);
        Product apple = ProductFactory.createProduct("FOOD", "Manzana", 1.0);

        Order order = new Order("ORD-777");
        order.addProduct(laptop);
        order.addProduct(shirt);
        order.addProduct(apple);

        order.subscribe(new EmailNotifier());
        order.subscribe(new SMSNotifier());
        order.subscribe(new LogNotifier());

        OrderService service = new OrderService();
        
        System.out.println("--- RESUMEN DE PRECIOS ---");
        System.out.println("Total Regular: $" + service.calculateTotal(order, new RegularDiscount()));
        System.out.println("Total Miembro: $" + service.calculateTotal(order, new MemberDiscount()));
        System.out.println("Total Black Friday: $" + service.calculateTotal(order, new BlackFridayDiscount()));
        System.out.println();

        System.out.println("--- ACTUALIZACIONES DE ESTADO ---");
        order.setStatus("PREPARING");
        System.out.println();
        order.setStatus("SHIPPED");
    }
}
