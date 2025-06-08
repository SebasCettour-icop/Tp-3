package resol.CettourS.ejercicio4;

public class Ejercicio4 {
    public static void ejecutar() {
        Administrativo admin = new Administrativo("Lucía Pérez", 12345678, 100000, 12, true);
        Produccion op = new Produccion("Carlos Soto", 87654321, 95000, 7, "nocturno");

        System.out.println("\n--- INFORMACIÓN DE EMPLEADOS ---\n");
        admin.mostrarInformacion();
        System.out.println();
        op.mostrarInformacion();

        System.out.println("\nTotal de empleados registrados: " + Empleado.getTotalEmpleados());
    }
}
