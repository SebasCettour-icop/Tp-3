package resol.CettourS.ejercicio4;

public class Administrativo extends Empleado implements Calculable {
    private boolean remoto; // true = remoto, false = presencial

    public Administrativo(String nombre, int dni, double sueldoBase, int antiguedad, boolean remoto) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.remoto = remoto;
    }
    public boolean isRemoto() {
        return remoto;
    }

    public void setRemoto(boolean remoto) {
        this.remoto = remoto;
    }

    @Override
    public double calcularSalario() {
        double descuento = remoto ? 0.12 : 0.08;
        double salarioNeto = getSueldoBase() * (1 - descuento);

        if (getAntiguedad() > 15) {
            salarioNeto *= 1.20;
        } else if (getAntiguedad() > 10) {
            salarioNeto *= 1.15;
        } else if (getAntiguedad() > 5) {
            salarioNeto *= 1.10;
        }

        return salarioNeto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== ADMINISTRATIVO ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Sueldo base: $" + getSueldoBase());
        System.out.println("Antigüedad: " + getAntiguedad() + " años");
        System.out.println("Modalidad: " + (remoto ? "Remoto" : "Presencial"));
        System.out.println("Salario neto: $" + String.format("%.2f", calcularSalario()));
    }
}
