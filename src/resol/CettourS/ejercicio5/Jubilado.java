package resol.CettourS.ejercicio5;

import java.time.LocalDate;

public class Jubilado extends Cliente {
    public Jubilado(String nombre, String dni, LocalDate fechaPrestamo, double monto, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, monto, fechaPactadaPago);
    }

    public double calcularInteres(double monto, int meses) {
        return monto * 0.08 * meses;
    }
}
