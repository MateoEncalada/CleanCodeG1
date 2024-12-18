package clean;
import java.util.ArrayList;
import java.util.List;
class CustomerManager {
    private List<String> customers = new ArrayList<>();

    // Añade un cliente a la lista
    public void addCustomer(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Error: El nombre del cliente no puede estar vacío.");
            return;
        }
        customers.add(name);
        System.out.println("Cliente añadido: " + name);
    }

    // Verifica si un cliente existe
    public boolean customerExists(String name) {
        return customers.contains(name);
    }

    // Genera un reporte de clientes
    public void generateCustomerReport() {
        System.out.println("Reporte de Clientes:");
        for (String customer : customers) {
            System.out.println("- Cliente: " + customer);
        }
    }
}