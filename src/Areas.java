import javax.swing.*;
import java.util.Scanner;

public class Areas {
    public static  void main (String args[]){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Eligir opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

        int figura = entrada.nextInt();

        switch (figura){

            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

                System.out.println("El area del cuadro es: "+ Math.pow(lado, 2));

                break;
            case 2:

                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce Base"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura"));

                System.out.println("El area del rectangulo es " + base*altura);

            case 3:
                int baset = Integer.parseInt(JOptionPane.showInputDialog("Introduce Base"));
                int alturat = Integer.parseInt(JOptionPane.showInputDialog("Introduce Altura"));

                System.out.println("El Area del trigangulo es " +(baset*alturat)/2);

                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce Radio"));

                System.out.println("El area del circulo es ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

                break;
            default:
                System.out.println("La opcion no es correcta");
        }

    }

}
