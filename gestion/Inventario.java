package gestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventario {
    private Map<String, Integer> stock;

    public Inventario() {
        this.stock = new HashMap<>();
        inicializarStockAuto();
    }

    private void inicializarStockAuto() {
        
        stock.put("Pan", 50);
        stock.put("Carne", 30);
        stock.put("Queso", 40);
        
        
        stock.put("Botella", 60);
        stock.put("Gaseosa", 25);
        stock.put("Agua", 35);
    }
    public void inicializarStockM(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Pan: ");
        stock.put("Pan", sc.nextInt());
        System.out.println("\nCarne: ");
        stock.put("Carne", sc.nextInt());
        System.out.println("\nQueso: ");
        stock.put("Queso", sc.nextInt());
        
        System.out.println("\nBotella: ");
        stock.put("Botella", sc.nextInt());
        System.out.println("\nGaseosa: ");
        stock.put("Gaseosa", sc.nextInt());
        System.out.println("\nAgua: ");
        stock.put("Agua", sc.nextInt());
    }

    public boolean verificarDisponibilidad(Map<String, Integer> insumosRequeridos) {
        for (Map.Entry<String, Integer> entry : insumosRequeridos.entrySet()) {
            String insumo = entry.getKey();
            int cantidadRequerida = entry.getValue();
            int stockActual = stock.getOrDefault(insumo, 0);
            
            if (stockActual < cantidadRequerida) {
                return false;
            }
        }
        return true;
    }

    public void descontarInsumos(Map<String, Integer> insumosRequeridos) {
        for (Map.Entry<String, Integer> entry : insumosRequeridos.entrySet()) {
            String insumo = entry.getKey();
            int cantidad = entry.getValue();
            int stockActual = stock.getOrDefault(insumo, 0);
            stock.put(insumo, stockActual - cantidad);
        }
    }

    public void mostrarStock() {
        System.out.println("\n===== INVENTARIO ACTUAL =====");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }

    public Map<String, Integer> getStock() {
        return stock;
    }
}