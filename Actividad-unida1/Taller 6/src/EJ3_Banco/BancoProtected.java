package EJ3_Banco;

public class Banco {
    protected double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }
}
//Este diseño es inseguro porque cualquier subclase o
// clase en el mismo paquete podría modificar directamente el saldo, lo que rompe la seguridad
//deberia ser private