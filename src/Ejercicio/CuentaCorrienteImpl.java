package Ejercicio;

public class CuentaCorrienteImpl implements Cuenta {

    public String cuenta() {
        return "Cuenta Corriente";
    }

    @Override
    public int obtenerMontoMaximo() {
        return 5000000;
    }

    public int obtenerMontoMinimo() {
        return 1000000;
    }
}