package resol.CettourS.ejercicio5;

import java.time.LocalDate;


public class ClienteGeneral extends Cliente {
    public ClienteGeneral(String nombre, String dni, LocalDate fechaPrestamo, double monto, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, monto, fechaPactadaPago);
    }

    public double calcularInteres(double monto, int meses) {
        return monto * 0.15 * meses;
    }
}

