package resol.CettourS.ejercicio1;

public class Ejercicio1 {
    public static void ejecutar() {
        Estudiante e1 = new Estudiante("Lucía Ramírez", 20, 5.5);
        Estudiante e2 = new Estudiante("Tomás Gómez", 22, 7.8);
        Estudiante e3 = new Estudiante("Valentina Torres", 19, 9.2);

        System.out.println("----- Estudiante 1 -----");
        e1.mostrarInformacion();
        e1.aprobo();

        System.out.println("----- Estudiante 2 -----");
        e2.mostrarInformacion();
        e2.aprobo();

        System.out.println("----- Estudiante 3 -----");
        e3.mostrarInformacion();
        e3.aprobo();
    }
}
