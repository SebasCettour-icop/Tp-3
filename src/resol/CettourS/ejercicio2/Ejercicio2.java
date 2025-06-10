package resol.CettourS.ejercicio2;

public class Ejercicio2 {
    public static void ejecutar() {
        Vehiculo v1 = new Vehiculo("Toyota Hilux", 2020, 140000);
        Vehiculo v2 = new Vehiculo("Ford Ranger", 2018, 187000);
        Vehiculo v3 = new Vehiculo("Chevrolet S10", 2021, 90000);
        Vehiculo v4 = new Vehiculo("Volkswagen Amarok", 2019, 120000);

        System.out.println("----- Vehículo 1 -----");
        v1.mostrarInformacion();
        v1.recorrer(600);
        v1.proximoServicio();

        System.out.println("\n----- Vehículo 2 -----");
        v2.mostrarInformacion();
        v2.recorrer(1300);
        v2.proximoServicio();

        System.out.println("\n----- Vehículo 3 -----");
        v3.mostrarInformacion();
        v3.recorrer(850);
        v3.proximoServicio();

        System.out.println("\n----- Vehículo 4 -----");
        v4.mostrarInformacion();
        v4.recorrer(400);
        v4.proximoServicio();
    }
}
