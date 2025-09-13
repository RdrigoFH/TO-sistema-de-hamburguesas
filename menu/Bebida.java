package menu;

import java.util.Map;

public class Bebida {
   private String nombre;
   private String tamano;
   private double precio;
   private Map<String, Integer> insumos; // like {"Botella":1, "Gaseosa":1}

   public Bebida(String nombre, String tamano, double precio, Map<String, Integer> insumos) {
      this.nombre = nombre;
      this.tamano = tamano;
      this.precio = precio;
      this.insumos = insumos;
   }

   public String getNombre() {
      return nombre;
   }

   public String getTamano() {
      return tamano;
   }

   public double getPrecio() {
      return precio;
   }

   public Map<String, Integer> getInsumos() {
      return insumos;
   }

   public String getInfo() {
      return nombre + " (" + tamano + ") - $" + precio;
   }
}
