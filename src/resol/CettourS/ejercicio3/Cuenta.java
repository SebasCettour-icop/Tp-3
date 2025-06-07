package resol.CettourS.ejercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cuenta {
    private int numero_cuenta;
    private double saldo;
    private String titular_cuenta;

    public Cuenta(int numero_cuenta, double saldo, String titular_cuenta) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
        this.titular_cuenta = titular_cuenta;
    }

    public void registrar_transaccion(String tipo, double monto) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        String fechaAhora = ahora.format(formato);
        System.out.println("[" + fechaAhora + "]" + tipo + ": $" + monto);
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            registrar_transaccion("Depósito", cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");

        }

    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            registrar_transaccion("Retiro de efectivo", cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void consultar_saldo() {
        registrar_transaccion("Saldo actual", saldo);
    }


}