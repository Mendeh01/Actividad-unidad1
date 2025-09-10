package Test;

import vehiculos.Moto;

public class TestVehiculo {
    public static void main(String[] args) {
        Moto m = new Moto("Deportiva");

        // no se puede acceder a miembros default de Vehiculo y Moto
        // m.mostrarTipo(); // No compila porque está en otro paquete
    }
}