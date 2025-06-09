package resol.CettourS.ejercicio5;


import java.time.LocalDate;

public class ClientePublico extends Cliente {
    public ClientePublico(String nombre, String dni, LocalDate fechaPrestamo, double monto, LocalDate fechaPactadaPago) {
        super(nombre, dni, fechaPrestamo, monto, fechaPactadaPago);
    }

    public double calcularInteres(double monto, int meses) {
        return monto * 0.10 * meses;
    }
}
