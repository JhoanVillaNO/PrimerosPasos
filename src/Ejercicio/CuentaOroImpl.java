package Ejercicio;

public class CuentaOroImpl implements Cuenta {

    public String cuenta() {
        return "Cuenta oro";
    }

    @Override
    public int obtenerMontoMaximo() {
        return 10000000;
    }
    public int obtenerMontoMinimo() {

        return 5000000;
    }

}