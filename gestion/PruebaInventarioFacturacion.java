package gestion;

import acciones.Pedido;
import menu.Menu;
import personas.Cliente;
import personas.Mozo;

public class PruebaInventarioFacturacion {
    public static void main(String[] args) {
        // Crear menú, cliente y mozo
        Menu menu = new Menu();
        Cliente cliente = new Cliente("Ana García", "79958555", "988856325");
        Mozo mozo = new Mozo("Carlos", menu);
        
        // Crear inventario
        Inventario inventario = new Inventario();
        
        System.out.println("=== INVENTARIO INICIAL ===");
        inventario.mostrarStock();
        
        // Tomar pedido
        Pedido pedido = mozo.tomarPedido(cliente);
        
        // Verificar disponibilidad de insumos
        boolean disponible = true;
        for (menu.Hamburguesa h : pedido.getHamburguesas()) {
            if (!inventario.verificarDisponibilidad(h.getInsumos())) {
                System.out.println("No hay suficiente stock para: " + h.getNombre());
                disponible = false;
            }
        }
        
        for (menu.Bebida b : pedido.getBebidas()) {
            if (!inventario.verificarDisponibilidad(b.getInsumos())) {
                System.out.println("No hay suficiente stock para: " + b.getNombre());
                disponible = false;
            }
        }
        
        if (disponible) {
            // Descontar insumos del inventario
            for (menu.Hamburguesa h : pedido.getHamburguesas()) {
                inventario.descontarInsumos(h.getInsumos());
            }
            
            for (menu.Bebida b : pedido.getBebidas()) {
                inventario.descontarInsumos(b.getInsumos());
            }
            
            // Generar factura
            Factura factura = new Factura(pedido);
            factura.mostrarFactura();
            
            System.out.println("\n=== INVENTARIO DESPUÉS DEL PEDIDO ===");
            inventario.mostrarStock();
            
        } else {
            System.out.println("No se puede procesar el pedido por falta de stock.");
        }
    }
}