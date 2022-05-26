import java.util.Scanner;

public class Prueba {

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);



        String nombreusuario = entrada.nextLine();

        System.out.println("Ingrese edad: ");

        int edad = entrada.nextInt();

        System.out.println("Usuario: " + nombreusuario + " y la edad es "+ (edad+1) + " años");

    }
}
