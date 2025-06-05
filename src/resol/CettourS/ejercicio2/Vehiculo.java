package resol.CettourS.ejercicio2;

public class Vehiculo {
    private String marca;
    private int modelo;
    private double kilometros;

    // Constructor
    public Vehiculo(String marca, int modelo, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometraje: " + kilometros + " km");
    }

    public void recorrer(int kms) {
        this.kilometros += kms;
        System.out.println("Se recorrieron " + kms + " km. Nuevo kilometraje: " + kilometros + " km");
    }

    public void proximoServicio() {
        double siguienteServicio = Math.ceil(kilometros / 10000) * 10000;
        if (siguienteServicio == kilometros) {
            siguienteServicio += 10000;
        }
        System.out.println("Próximo servicio técnico: a los " + (int) siguienteServicio + " km");
    }
}
