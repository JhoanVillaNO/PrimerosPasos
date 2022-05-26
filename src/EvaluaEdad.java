
import java.util.Scanner;

public class EvaluaEdad {

    public static void main (String arg[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introducir Edad: ");

        int edad = entrada.nextInt();

        if (edad >= 18) {

            System.out.println("mayor de edad");

        }
        else {
            System.out.println("Es menor");
        }
    }
}
