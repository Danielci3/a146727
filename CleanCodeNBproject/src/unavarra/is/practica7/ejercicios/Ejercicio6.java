package unavarra.is.practica7.ejercicios;

// Paso 1: Crear la clase "Dni"
public class Ejercicio6 {

    // Método para obtener la letra del DNI
    public static char obtenerLetra(int dni) {
        // Paso 3: Sustituir el switch por un String y usar charAt
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(dni % 23);
    }

    // Método público para validar un DNI completo con número y letra
    public static boolean validarDni(int dni, char letra) {
        return obtenerLetra(dni) == Character.toUpperCase(letra);
    }

    public static void main(String[] args) {
        // Prueba del método obtenerLetra
        System.out.println(obtenerLetra(72700123)); // T

        // Prueba del método validarDni
        System.out.println(validarDni(72700123, 'T')); // true
        System.out.println(validarDni(72700123, 'R')); // false
    }
}
