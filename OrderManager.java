package clean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OrderManager {
    private Map<String, List<String>> orders = new HashMap<>();

    // Añade una orden para un cliente
    public void addOrder(String customerName, String orderDetails) {
        if (customerName == null || orderDetails == null || orderDetails.isEmpty()) {
            System.out.println("Error: Información de la orden no válida.");
            return;
        }

        // Si el cliente no tiene órdenes aún, crea la lista
        orders.putIfAbsent(customerName, new ArrayList<>());
        orders.get(customerName).add(orderDetails);
        System.out.println("Orden añadida para " + customerName + ": " + orderDetails);
    }

    // Procesa las órdenes de un cliente específico
    public void processOrders(String customerName) {
        if (!orders.containsKey(customerName)) {
            System.out.println("No hay órdenes para el cliente: " + customerName);
            return;
        }

        System.out.println("Procesando órdenes para: " + customerName);
        for (String order : orders.get(customerName)) {
            System.out.println("- Orden procesada: " + order);
        }
    }

    // Genera un reporte de órdenes
    public void generateOrderReport() {
        System.out.println("Reporte de Órdenes:");
        orders.forEach((customer, orderList) -> {
            System.out.println("Cliente: " + customer);
            for (String order : orderList) {
                System.out.println("  - Orden: " + order);
            }
        });
    }
}