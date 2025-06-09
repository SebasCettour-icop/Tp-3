package resol.CettourS.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void ejecutar() {
        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cliente1 = new ClientePublico("Ana González", "16123456", LocalDate.of(2025, 6, 1), 100_000, LocalDate.of(2025, 9, 1));
        cliente1.setFechaPagoEfectivo(LocalDate.of(2025, 9, 5));
        clientes.add(cliente1);

        Cliente cliente2 = new Jubilado("Carlos Martínez", "8765432", LocalDate.of(2025, 6, 10), 80_000, LocalDate.of(2025, 9, 10));
        cliente2.setFechaPagoEfectivo(LocalDate.of(2025, 9, 10));
        clientes.add(cliente2);

        Cliente cliente3 = new ClienteGeneral("Lucía Torres", "34567890", LocalDate.of(2025, 6, 15), 50_000, LocalDate.of(2025, 9, 15));
        cliente3.setFechaPagoEfectivo(LocalDate.of(2025, 9, 17));
        clientes.add(cliente3);

        System.out.println("=== INFORME DE PRÉSTAMOS ===\n");
        for (Cliente c : clientes) {
            c.mostrarInformacion(3); // Suponiendo 3 meses de duración
            System.out.println("------------------------------------\n");
        }
    }
}
