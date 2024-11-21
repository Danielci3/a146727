package unavarra.is.practica7.ejercicios;

public class Ejercicio4 {
    
    // Paso 1: Cambiar la firma del método para hacerlo más semántico
    public static String obtenerDiaDeLaSemana(int dia) {
        // Paso 3: Usar un array de String para representar los días de la semana
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};

        // Validar el rango del parámetro
        if (dia < 1 || dia > 7) {
            return "día incorrecto";
        }
        
        // Usar el índice del array para devolver el día correspondiente
        return dias[dia - 1];
    }

    public static void main(String[] args) {
        System.out.println(obtenerDiaDeLaSemana(3));  // miércoles
        System.out.println(obtenerDiaDeLaSemana(8));  // día incorrecto
    }
}
