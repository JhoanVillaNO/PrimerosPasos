package Ejercicio;

public class Cliente {
    private int edad;
    private String CuentaBancaria;

    public Cliente (int parEdad) {
        edad = parEdad;
    }
    public int obtenerEdad() {
        return edad;
    }
    public String crearCuenta (){

        if(edad>=16 && edad<=23){
            return CuentaBancaria = new CuentaJovenImpl().cuenta();
        } else if (edad>=24 && edad <=32){
            return CuentaBancaria = new CuentaCorrienteImpl().cuenta();
        } else if (edad>=33 && edad <=40){
            return CuentaBancaria = new CuentaOroImpl().cuenta();
        } else if (edad>=41 && edad <=60){
            return CuentaBancaria = new CuentaExperienceImpl().cuenta();
        }
            return "No Cuenta";
    }

    }