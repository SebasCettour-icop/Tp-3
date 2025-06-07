package resol.CettourS.ejercicio3;

import java.util.Random;

// Hice que el depósito y el retiro sean aleatorios

public class Ejercicio3 {
    public static void ejecutar() {
        Cuenta cuenta1 = new Cuenta(12345, 1000.0, "Sebastián Cettour");

        Random random = new Random();

        double depositoAleatorio = 100 + random.nextInt(901);
        cuenta1.depositar(depositoAleatorio);

        double retiroAleatorio = 50 + random.nextInt(751);
        cuenta1.retirar(retiroAleatorio);

        cuenta1.consultar_saldo();
    }
}




