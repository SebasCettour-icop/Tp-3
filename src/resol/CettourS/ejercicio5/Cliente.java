package resol.CettourS.ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente implements PrestamoCalculable {
    private String nombre;
    private String dni;
    private LocalDate fechaPrestamo;
    private double monto;
    private LocalDate fechaPactadaPago;
    private LocalDate fechaPagoEfectivo;

    public Cliente(String nombre, String dni, LocalDate fechaPrestamo, double monto, LocalDate fechaPactadaPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.monto = monto;
        this.fechaPactadaPago = fechaPactadaPago;
    }

    public void setFechaPagoEfectivo(LocalDate fechaPagoEfectivo) {
        this.fechaPagoEfectivo = fechaPagoEfectivo;
    }

    public long calcularDiasAtraso() {
        if (fechaPagoEfectivo != null && fechaPagoEfectivo.isAfter(fechaPactadaPago)) {
            return ChronoUnit.DAYS.between(fechaPactadaPago, fechaPagoEfectivo);
        }
        return 0;
    }

    public double calcularPenalidad() {
        long diasAtraso = calcularDiasAtraso();
        return monto * 0.02 * diasAtraso;
    }

    public double calcularMontoFinal(double interesCalculado) {
        return monto + interesCalculado + calcularPenalidad();
    }

    public void mostrarInformacion(int meses) {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Tipo de cliente: " + this.getClass().getSimpleName());
        System.out.println("Monto solicitado: $" + monto);
        System.out.println("Fecha pactada de pago: " + fechaPactadaPago);
        double interes = calcularInteres(monto, meses);
        System.out.println("Interés total calculado: $" + String.format("%.2f", interes));
        long diasAtraso = calcularDiasAtraso();
        if (diasAtraso > 0) {
            System.out.println("Días de atraso: " + diasAtraso);
            System.out.println("Penalidad: $" + String.format("%.2f", calcularPenalidad()));
        } else {
            System.out.println("Pago en término.");
        }
        System.out.println("Monto total a pagar: $" + String.format("%.2f", calcularMontoFinal(interes)));
    }

    public double getMonto() { return monto; }
    public LocalDate getFechaPactadaPago() { return fechaPactadaPago; }
}
