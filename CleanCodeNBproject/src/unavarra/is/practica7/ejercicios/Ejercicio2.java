package unavarra.is.practica7.ejercicios;

public class Ejercicio2 {
    
    // Paso 1: Cambiar el nombre del método para reflejar que devuelve un booleano
    public static Boolean esPar(int numero) {
        // Paso 2: Simplificar el método a una sola línea
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(esPar(2)); // true
        System.out.println(esPar(3)); // false
    }
}
