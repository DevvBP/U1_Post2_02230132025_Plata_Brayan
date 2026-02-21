# U1_Post2_02230132025_Plata_Brayan.zip
Implementar un sistema de e-commerce simplificado en Java que integre tres patrones de diseño fundamentales (Observer, Factory Method y Strategy) junto con principios SOLID y Clean Code, demostrando la capacidad de tomar decisiones de diseño justificadas.

# Proyecto de E-Commerce - Actividad Patrones de Diseño

## Patrones Implementados
1. **Factory Method:** Se utiliza `ProductFactory` para instanciar productos (`Electronics`, `Clothing`, `Food`) sin conocer sus clases concretas.
2. **Observer:** La clase `Order` actúa como sujeto, notificando a `EmailNotifier`, `SMSNotifier` y `LogNotifier` sobre cambios de estado.
3. **Strategy:** Permite aplicar diferentes lógicas de descuento (`Regular`, `Member`, `BlackFriday`) de forma dinámica sobre el total del pedido.

## Diagrama UML Textual
[Order] --|> [OrderSubject]
[Order] o-- [OrderObserver]
[OrderService] --> [DiscountStrategy]
[ProductFactory] --> [Product]
