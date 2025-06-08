package resol.CettourS.ejercicio4;

public class Produccion extends Empleado implements Calculable {
    private String turno;

    public Produccion(String nombre, int dni, double sueldoBase, int antiguedad, String turno) {
        super(nombre, dni, sueldoBase, antiguedad);
        this.turno = turno.toLowerCase();
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno.toLowerCase();
    }

    @Override
    public double calcularSalario() {
        double descuento;

        if (turno.equals("diurno")) {
            descuento = 0.08;
        } else if (turno.equals("nocturno")) {
            descuento = 0.06;
        } else {
            System.out.println("Turno inválido para " + getNombre() + ". Se aplicará 0% de descuento.");
            descuento = 0.0;
        }

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
        System.out.println("=== OPERARIO DE PRODUCCIÓN ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Sueldo base: $" + getSueldoBase());
        System.out.println("Antigüedad: " + getAntiguedad() + " años");
        System.out.println("Turno: " + turno);
        System.out.println("Salario neto: $" + String.format("%.2f", calcularSalario()));
    }
}
