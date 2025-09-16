package acciones;

import java.util.ArrayList;
import java.util.List;
import menu.Bebida;
import menu.Hamburguesa;
import personas.Cliente;

public class Pedido {
    private Cliente cliente;
    private List<Hamburguesa> hamburguesas;
    private List<Bebida> bebidas;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.hamburguesas = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }

    public void agregarHamburguesa(Hamburguesa h) {
        hamburguesas.add(h);
    }

    public void agregarBebida(Bebida b) {
        bebidas.add(b);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Hamburguesa h : hamburguesas) {
            total += h.getPrecio();
        }
        for (Bebida b : bebidas) {
            total += b.getPrecio();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("=== Pedido de " + cliente.getNombre() + " ===");
        if (hamburguesas.isEmpty() && bebidas.isEmpty()) {
            System.out.println("No hay ítems en el pedido.");
        } else {
            for (Hamburguesa h : hamburguesas) {
                System.out.println("Hamburguesa: " + h.getInfo());
            }
            for (Bebida b : bebidas) {
                System.out.println("Bebida: " + b.getInfo());
            }
        }
        System.out.println("Total: $" + calcularTotal());
    }
    public Cliente getCliente() {
        return cliente;
    }

    public List<Hamburguesa> getHamburguesas() {
        return hamburguesas;
    }

    public List<Bebida> getBebidas() {
        return bebidas;
    }
}
