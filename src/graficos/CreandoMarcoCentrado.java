package graficos;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

    public static void main(String args[]){

        MarcoCentrado  miMarco = new MarcoCentrado();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }

}

class MarcoCentrado extends JFrame{

    public MarcoCentrado(){

        Toolkit mipantalla = Toolkit.getDefaultToolkit();

        Dimension TamanioPantalla = mipantalla.getScreenSize();

        int alturaPantalla = TamanioPantalla.height;
        int anchoPantalla = TamanioPantalla.width;

        setSize(anchoPantalla/2,alturaPantalla/2);
        setLocation(anchoPantalla/4,alturaPantalla/4);
        setTitle("VENTANA");

        Image miIcono = mipantalla.getImage("icono.gif");

        setIconImage(miIcono);
    }
}
