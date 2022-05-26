import javax.swing.*;

public class AccesoAplicacion {
    public static void main(String args[]) {

        String clave = "1234";
        String pass = "";

        while (clave.equals(pass) == false) {

            pass = JOptionPane.showInputDialog("Introducir Contraseña ");

            if (clave.equals(pass) == false) {

                System.out.println("Contraseña Incorrecta");
            }
        }
        System.out.println("Contraseña Correcta");
    }
}
