package unavarra.is.practica7.ejercicios;

import java.time.LocalDate;

// Paso 1: Crear la clase "Paciente"
class Paciente {
    private String nombre;
    private int anioNacimiento;
    private float peso;
    private float altura;

    public Paciente(String nombre, float peso, float altura, int anioNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.anioNacimiento = anioNacimiento;
    }

    // Método privado para calcular la edad
    private int calcularEdad() {
        return LocalDate.now().getYear() - anioNacimiento;
    }

    // Método privado para calcular el IMC
    private float calcularIMC() {
        return peso / (altura * altura);
    }

    // Método público para verificar si tiene riesgo cardiovascular
    public boolean tieneRiesgoCardiovascular() {
        return calcularIMC() >= 25.0f && calcularEdad() > 65;
    }

    // Método público para obtener el nombre del paciente
    public String getNombre() {
        return nombre;
    }
}

public class Ejercicio7 {

    // Paso 4: Cambiar el método para recibir un array de Pacientes y mejorar el nombre
    public static void evaluarRiesgoCardiovascular(Paciente[] pacientes) {
        for (Paciente paciente : pacientes) {
            if (paciente.tieneRiesgoCardiovascular()) {
                System.out.println(paciente.getNombre() + " tiene riesgo cardiovascular");
            }
        }
    }

    public static void main(String[] args) {
        // Crear un array de Pacientes
        Paciente[] pacientes = {
            new Paciente("paciente1", 80.2f, 1.84f, 2001),
            new Paciente("paciente2", 90.2f, 1.75f, 1940),
            new Paciente("paciente3", 89.2f, 1.75f, 2001)
        };

        // Llamar al método para evaluar el riesgo cardiovascular
        evaluarRiesgoCardiovascular(pacientes);
    }
}
