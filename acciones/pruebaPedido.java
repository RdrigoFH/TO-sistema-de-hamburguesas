package acciones;

import menu.Menu;
import personas.Cliente;
import personas.Mozo;

public class pruebaPedido {
    public static void main(String[] args) {
        // Crear menú
        Menu menu = new Menu();

        // Crear cliente y mozo
        Cliente cliente = new Cliente("Juan Pérez","123456789", "99999999");
        Mozo mozo = new Mozo("Carlos", menu);

        // Tomar pedido
        Pedido pedido = mozo.tomarPedido(cliente);
        System.out.println();

        // Mostrar pedido con cálculo total
        pedido.mostrarPedido();
    }
}
