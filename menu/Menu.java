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
