package clean;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        OrderManager orderManager = new OrderManager();

        // Añadir clientes
        customerManager.addCustomer("John Doe");
        customerManager.addCustomer("Jane Smith");

        // Añadir órdenes
        if (customerManager.customerExists("John Doe")) {
            orderManager.addOrder("John Doe", "Order1");
        }
        if (customerManager.customerExists("Jane Smith")) {
            orderManager.addOrder("Jane Smith", "Order2");
        }

        // Procesar órdenes
        orderManager.processOrders("John Doe");

        // Generar reportes
        customerManager.generateCustomerReport();
        orderManager.generateOrderReport();
    }
}
