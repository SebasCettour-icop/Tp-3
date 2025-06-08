package resol.CettourS.ejercicio4;

public abstract class Empleado {
    private String nombre;
    private int dni;
    private double sueldoBase;
    private int antiguedad;

    private static int totalEmpleados = 0;

    public Empleado(String nombre, int dni, double sueldoBase, int antiguedad) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;

        totalEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public abstract void mostrarInformacion();
}
