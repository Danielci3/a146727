package unavarra.is.practica7.ejercicios;

public class Ejercicio1 {
    
    // Paso 1 y 2: Cambiar el nombre del método y del parámetro a algo más significativo
    public static Boolean comienzaPorAyTerminaEnS(String cadena) {
        // Paso 3 y 4: Simplificar el código eliminando los if redundantes
        return cadena.startsWith("A") && cadena.endsWith("S");
    }

    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(comienzaPorAyTerminaEnS("HOLA"));
        System.out.println(comienzaPorAyTerminaEnS("ADIOS"));
    }
}
