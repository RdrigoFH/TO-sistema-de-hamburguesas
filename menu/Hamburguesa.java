package menu;

import java.util.Map;

public class Hamburguesa {
   private String nombre;
   private String descripcion;
   private double precio;
   private Map<String, Integer> insumos; // like {"Pan":1, "Carne":1, "Queso":1}

   public Hamburguesa(String nombre, String descripcion, double precio, Map<String, Integer> insumos) {
      this.nombre = nombre;
      this.descripcion = descripcion;
      this.precio = precio;
      this.insumos = insumos;
   }

   public String getNombre() {
      return nombre;
   }

   public double getPrecio() {
      return precio;
   }

   public Map<String, Integer> getInsumos() {
      return insumos;
   }

   public String getInfo() {
      return nombre + " - " + descripcion + " ($" + precio + ")";
   }
}
