package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
   private List<Hamburguesa> hamburguesas;
   private List<Bebida> bebidas;

   public Menu() {
      this.hamburguesas = new ArrayList<>();
      this.bebidas = new ArrayList<>();
      inicializarMenu();
   }

   private void inicializarMenu() {
      // Hamburguesas
      Map<String, Integer> insumosClasica = new HashMap<>();
      insumosClasica.put("Pan", 1);
      insumosClasica.put("Carne", 1);
      insumosClasica.put("Queso", 1);
      hamburguesas.add(new Hamburguesa("Clásica", "Carne, queso y pan", 12.50, insumosClasica));

      Map<String, Integer> insumosDoble = new HashMap<>();
      insumosDoble.put("Pan", 1);
      insumosDoble.put("Carne", 2);
      insumosDoble.put("Queso", 1);
      hamburguesas.add(new Hamburguesa("Doble", "Doble carne con queso", 18.00, insumosDoble));

      // Bebidas
      Map<String, Integer> insumosCola = new HashMap<>();
      insumosCola.put("Botella", 1);
      insumosCola.put("Gaseosa", 1);
      bebidas.add(new Bebida("Coca Cola", "500ml", 5.00, insumosCola));

      Map<String, Integer> insumosAgua = new HashMap<>();
      insumosAgua.put("Botella", 1);
      insumosAgua.put("Agua", 1);
      bebidas.add(new Bebida("Agua Mineral", "500ml", 3.50, insumosAgua));
   }

   public void mostrarMenu() {
      System.out.println("===== MENÚ DE HAMBURGUESAS =====");
      for (int i = 0; i < hamburguesas.size(); i++) {
         System.out.println((i + 1) + ". " + hamburguesas.get(i).getInfo());
      }

      System.out.println("\n===== MENÚ DE BEBIDAS =====");
      for (int i = 0; i < bebidas.size(); i++) {
         System.out.println((i + 1) + ". " + bebidas.get(i).getInfo());
      }
   }

   public Hamburguesa getHamburguesa(String nombre) {
      for (Hamburguesa h : hamburguesas) {
         if (h.getNombre().equalsIgnoreCase(nombre)) {
            return h;
         }
      }
      return null;
   }

   public Bebida getBebida(String nombre) {
      for (Bebida b : bebidas) {
         if (b.getNombre().equalsIgnoreCase(nombre)) {
            return b;
         }
      }
      return null;
   }

   public List<Hamburguesa> getHamburguesas() {
      return hamburguesas;
   }

   public List<Bebida> getBebidas() {
      return bebidas;
   }
}
