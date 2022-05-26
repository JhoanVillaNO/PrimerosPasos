package poo;

import javax.management.remote.rmi.RMIJRMPServerImpl;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public  static  void main(String args[]){

        /*Empleado empleado1= new Empleado("Carlos",85000, 1990, 12 , 17);
        Empleado empleado2= new Empleado("Sara", 95000, 1996, 06, 02);
        Empleado empleado3= new Empleado("Maria", 105000, 2002, 03, 15);
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Nombre:" +empleado1.getNombre() + " Sueldo: "+ empleado1.getSueldo()+ " Fecha Alta " + empleado1.getFechaContrato());
        System.out.println("Nombre "+empleado2.getNombre()+ " Sueldo"+ empleado2.getSueldo()+ " Fecha Alta "+ empleado2.getFechaContrato());
        System.out.println(("Nombre "+empleado3.getNombre()+ " Sueldo"+empleado3.getSueldo()+ " Fecha Alta"+ empleado3.getFechaContrato()));
        */




        Empleados[] miEmpleados = new Empleados[3];
        miEmpleados[0] = new Empleados("Carlos", 85000, 1990,12, 17);
        miEmpleados[1] = new Empleados("Sara", 95000, 1995,06, 02);
        miEmpleados[2] = new Empleados("Maria", 105000, 2002, 03,15);
        jefatura jefetic = new jefatura("Andre", 50000, 2000,11,9);

       /* miEmpleados[3] = jefetic; /*POLIMORFISMO*/
        /*
        for(int i = 0;i<3; i++){

            miEmpleados[i].subeSueldo(5);
        }

        for(int i = 0;i<3; i++){

            System.out.println("Nombre: "+ miEmpleados[i].getNombre()+" Sueldo: "+miEmpleados[i].getSueldo()+" Fecha Alta "+miEmpleados[i].getFechaContrato());

        }
        */

        System.out.println(jefetic.tomarDeciciones("Esta es una decision") +" y la prima es "+jefetic.estableceBonus(600) );

        for(Empleados e: miEmpleados){
            e.subeSueldo(5);

        }

        Arrays.sort(miEmpleados);

        for(Empleados e: miEmpleados){

            System.out.println("Nombre: "+ e.getNombre() + " Sueldo: "+ e.getSueldo()+ " Fecha Alta: "+ e.getFechaContrato());

        }
    }
}

class Empleados implements Comparable, Trabajadores {

    public Empleados(String nom, double sue, int anio, int mes, int dia){

        nombre = nom;
        sueldo = sue;

        //LIBRERIA DE util
        GregorianCalendar calendario=new GregorianCalendar(anio,mes-1,dia);
        altaContrato = calendario.getTime();

    }

    public String getNombre(){

        return nombre;

    }

    public Double getSueldo(){

        return sueldo;

    }

    public  Date getFechaContrato(){

        return altaContrato;

    }


    public void subeSueldo(double porcentaje){

        double aumento = sueldo*porcentaje/100;

        sueldo+=aumento;

    }

    public int compareTo(Object miobjeto){

        Empleados otroEmpleado = (Empleados) miobjeto;

        if(this.sueldo<otroEmpleado.sueldo){

            return -1;
        }

        if(this.sueldo> otroEmpleado.sueldo){

            return 1;
        }

        return 0;

    }

    public double estableceBonus(double gratificacion){

        return Trabajadores.bonusbase+gratificacion;

    }


    private String nombre;
    private double sueldo;
    private Date altaContrato;

}

class jefatura extends Empleados implements Jefes {

    public jefatura(String nom,double sue, int anio, int mes, int dia){

        super(nom, sue, anio, mes, dia);

    }

    public String tomarDeciciones(String descision){

        return "Un miembro es de acabar "+descision;

    }

    public double estableceBonus(double gratificacion){

        double prima = 2000;
        return Trabajadores.bonusbase+gratificacion+prima;

    }

}


