package personas;

import acciones.Pedido;
import java.util.Scanner;
import menu.Bebida;
import menu.Hamburguesa;
import menu.Menu;

public class Mozo {
    private String nombre;
    private Menu menu;
    private Scanner scanner;

    public Mozo(String nombre, Menu menu) {
        this.nombre = nombre;
        this.menu = menu;
        this.scanner = new Scanner(System.in);
    }

    public Pedido tomarPedido(Cliente cliente) {
        System.out.println(nombre + " esta tomando el pedido de " + cliente.getNombre());
        Pedido pedido = new Pedido(cliente);

        System.out.println("\n===== MENU DISPONIBLE =====");
        menu.mostrarMenu();

        // Hamburguesas
        while (true) {
            System.out.print("\nIngrese el nombre de la hamburguesa que desea (o escriba 'fin' para terminar): ");
            String nombreHamburguesa = scanner.nextLine().trim();
            if (nombreHamburguesa.equalsIgnoreCase("fin")) {
                break;
            }
            Hamburguesa h = menu.getHamburguesa(nombreHamburguesa);
            if (h != null) {
                pedido.agregarHamburguesa(h);
                System.out.println("Se agrego la hamburguesa: " + h.getInfo());
            } else {
                System.out.println("No se encontro esa hamburguesa en el menu.");
            }
        }

        // Bebidas
        while (true) {
            System.out.print("\nIngrese el nombre de la bebida que desea (o escriba 'fin' para terminar): ");
            String nombreBebida = scanner.nextLine().trim();
            if (nombreBebida.equalsIgnoreCase("fin")) {
                break;
            }
            Bebida b = menu.getBebida(nombreBebida);
            if (b != null) {
                pedido.agregarBebida(b);
                System.out.println("Se agrego la bebida: " + b.getInfo());
            } else {
                System.out.println("No se encontro esa bebida en el menu.");
            }
        }

        return pedido;
    }
}
