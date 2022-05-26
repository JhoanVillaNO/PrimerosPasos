import javax.swing.*;
import java.text.Format;
public class Arrelgo2 {

    public static void main (String args[]) {

        String[] paises = new  String[6];

       /* paises[0] = "A";
        paises[1] = "B";
        paises[2] = "C";
        paises[3] = "D";
        paises[4] = "E";
        paises[5] = "F";


        /*for(int i=0;i<paises.length;i++){

            System.out.println("Pais "+(i+1)+" "+paises[i]);
        }*/

        for(int i=0;i<6;i++){

            paises[i] = JOptionPane.showInputDialog("Introducir " + (i+1));
        }

        for(String elemento:paises){
            System.out.println(elemento);
        }

    }

}
