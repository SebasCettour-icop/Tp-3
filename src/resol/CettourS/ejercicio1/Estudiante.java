package resol.CettourS.ejercicio1;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaFinal;

    // Constructor
    public Estudiante(String nombre, int edad, double notaFinal) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota Final: " + notaFinal);
    }

    public void aprobo() {
        if (notaFinal < 6) {
            System.out.println("Estado: Desaprobó");
        } else if (notaFinal <= 8) {
            System.out.println("Estado: Regularizó");
        } else {
            System.out.println("Estado: Promocionó");
        }
        System.out.println(); // Línea en blanco para separación
    }
}

