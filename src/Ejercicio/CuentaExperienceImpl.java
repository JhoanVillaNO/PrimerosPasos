package Ejercicio;

public class CuentaExperienceImpl implements Cuenta {
    @Override
    public String cuenta() {
        return "Cuenta experience";
    }

    @Override
    public int obtenerMontoMaximo() {
        return 15000000;
    }

    @Override
    public int obtenerMontoMinimo() {
        return 10000000;
    }
}