package unavarra.is.practica7.ejercicios;

// Paso 3: Crear enumeración para los mensajes
enum ValidacionHora {
    CORRECTO,
    HORA_INCORRECTA,
    MINUTOS_INCORRECTOS,
    SEGUNDOS_INCORRECTOS
}

public class Ejercicio3 {

    // Paso 1: Modificar la firma del método para hacerlo más semántico
    public static ValidacionHora validarHora(int horas, int minutos, int segundos) {
        // Paso 2: Usar cláusulas de guardia para simplificar el código
        if (horas < 0 || horas >= 24) return ValidacionHora.HORA_INCORRECTA;
        if (minutos < 0 || minutos >= 60) return ValidacionHora.MINUTOS_INCORRECTOS;
        if (segundos < 0 || segundos >= 60) return ValidacionHora.SEGUNDOS_INCORRECTOS;
        
        return ValidacionHora.CORRECTO;
    }

    public static void main(String[] args) {
        System.out.println(validarHora(9, 34, 23)); // CORRECTO
        System.out.println(validarHora(25, 34, 23)); // HORA_INCORRECTA
    }
}
