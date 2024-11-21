package unavarra.is.practica7.ejercicios;

public class Ejercicio5 {
    
    // Paso 1: Cambiar la firma del método para hacerlo más semántico
    public static String obtenerDiasDelMes(int mes) {
        // Paso 3: Usar cláusulas de guardia para eliminar los "else"
        if (mes < 1 || mes > 12) return "es un mes incorrecto";
        if (mes == 2) return "es un mes de 29 o 30 días";
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) return "es un mes de 30 días";

        // Paso 2: Agrupar los meses con 31 días en una sola condición
        return "es un mes de 31 días";
    }

    public static void main(String[] args) {
        System.out.println(obtenerDiasDelMes(11)); // es un mes de 30 días
        System.out.println(obtenerDiasDelMes(2));  // es un mes de 29 o 30 días
        System.out.println(obtenerDiasDelMes(7));  // es un mes de 31 días
        System.out.println(obtenerDiasDelMes(13)); // es un mes incorrecto
    }
}
