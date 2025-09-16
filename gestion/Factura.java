package gestion;

import acciones.Pedido;
import menu.Bebida;
import menu.Hamburguesa;
import personas.Cliente;

public class Factura {
    private Pedido pedido;
    private String numeroFactura;
    private static int contadorFacturas = 1;

    public Factura(Pedido pedido) {
        this.pedido = pedido;
        this.numeroFactura = "FAC-" + String.format("%04d", contadorFacturas++);
    }

    public void mostrarFactura() {
        Cliente cliente = pedido.getCliente();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("            FACTURA #" + numeroFactura);
        System.out.println("=".repeat(50));
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("-".repeat(50));
        
        System.out.println("DETALLE DEL PEDIDO:");
        System.out.println("-".repeat(50));
        
        for (Hamburguesa h : pedido.getHamburguesas()) {
            System.out.printf("%-20s $%.2f%n", h.getNombre(), h.getPrecio());
        }
        
        for (Bebida b : pedido.getBebidas()) {
            System.out.printf("%-20s $%.2f%n", b.getNombre() + " (" + b.getTamano() + ")", b.getPrecio());
        }
        
        System.out.println("-".repeat(50));
        System.out.printf("%-20s $%.2f%n", "TOTAL:", pedido.calcularTotal());
        System.out.println("=".repeat(50));
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }
}