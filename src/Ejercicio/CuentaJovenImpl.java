package Ejercicio;

public class CuentaJovenImpl implements Cuenta {
    @Override
    public String cuenta() {
        return "Cuenta Joven";
    }

    @Override
    public int obtenerMontoMaximo() {
        return 1000000;
    }

    public int obtenerMontoMinimo() {
        return 500000;
    }

}