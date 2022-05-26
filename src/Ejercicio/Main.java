package Ejercicio;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String args[]){

      /* Cliente[] clientes = new Cliente[5];
        clientes[0] = new Cliente(18);
        clientes[1] = new Cliente(36);
        clientes[2] = new Cliente(55);
        clientes[3] = new Cliente(11);
        clientes[4] = new Cliente(23);

        //Ciclo para recorrer el arreglo for each
        for(Cliente e: clientes){
            System.out.println(e.cuenta()+": el monto min: "+e.montoMin()+ " el monto maximo: "+e.montoMax());
        }*/

        /*List<Cuenta> cuentaList = new ArrayList<>();
        Cuenta cuentaJ = new CuentaJovenImpl();
        Cuenta cuentaC = new CuentaCorrienteImpl();
        Cuenta cuentaO = new CuentaOroImpl();
        Cuenta cuentaE = new CuentaExperienceImpl();

        cuentaList.add(cuentaJ);
        cuentaList.add(cuentaC);
        cuentaList.add(cuentaO);
        cuentaList.add(cuentaE);

        cuentaList.forEach(cta->{
                    System.out.println("*Tipo de cuenta: " + cta.cuenta());
                    System.out.println("-Monto maximo: " + cta.obtenerMontoMaximo());
                    System.out.println("-Monto minimo: " + cta.obtenerMontoMinimo());
                }
        );*/

        List<Cliente> clienteList = new ArrayList<>();
        Cliente cliente1 = new Cliente(18);
        Cliente cliente2 = new Cliente(26);
        Cliente cliente3 = new Cliente(55);
        Cliente cliente4 = new Cliente(11);



        clienteList.add(cliente1);
        clienteList.add(cliente2);
        clienteList.add(cliente3);
        clienteList.add(cliente4);

        clienteList.forEach(cli->{
                    System.out.println("Edad: "+cli.obtenerEdad()+"   Tipo: "+cli.crearCuenta());
            }
            );
    }
}
