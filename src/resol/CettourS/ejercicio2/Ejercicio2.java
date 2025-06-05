package resol.CettourS.ejercicio2;

public class Ejercicio2 {
    public static void ejecutar() {
        Vehiculo v1 = new Vehiculo("Toyota Hilux", 2020, 140000);
        Vehiculo v2 = new Vehiculo("Ford Ranger", 2018, 187000);

        System.out.println("----- Vehículo 1 -----");
        v1.mostrarInformacion();
        v1.recorrer(600); // Simula recorrido
        v1.proximoServicio();

        System.out.println("\n----- Vehículo 2 -----");
        v2.mostrarInformacion();
        v2.recorrer(1300);
        v2.proximoServicio();
    }
}