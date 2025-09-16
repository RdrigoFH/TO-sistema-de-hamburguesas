package acciones;

import java.util.ArrayList;
import personas.Cliente;

public class GestorClientes {
    private ArrayList<Cliente> clientes;

    public GestorClientes() {
        clientes = new ArrayList<>();
    }

    // Registrar cliente
    public Cliente registrarCliente(String nombre, String dni, String telefono) {
        Cliente nuevo = new Cliente(nombre, dni, telefono);
        clientes.add(nuevo);
        return nuevo;
    }

    // Buscar cliente por DNI
    public Cliente buscarCliente(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null; // si no encuentra
    }

    // Listar clientes
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente c : clientes) {
                System.out.println(c.getDatos());
            }
        }
    }
}
