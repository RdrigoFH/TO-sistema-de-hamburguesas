package personas;

public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;

    // Constructor
    public Cliente(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    //Metodo para obtener datos
    public String getDatos() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
    }

    //metodo para tener unicamente el dni
    public String getDni() {
        return dni;
    }

    //metodo para obtener el nombre
    public String getNombre(){
        return nombre;
    }
}
