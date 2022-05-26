package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoMarco {

    public static void main(String args[]) {

        marcoConTex ventana = new marcoConTex();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}

    class marcoConTex extends JFrame{

        public marcoConTex(){

            setVisible(true);
            setSize(600,450);
            setLocation(400,200);
            setTitle("VENTANAAAAA");

            lamina lam = new lamina();
            add(lam);

        }
    }

    class lamina extends JPanel{

        public void paintComponent(Graphics g){

            super.paintComponent(g);
            g.drawString("Aqui",100,100);
        }


    }

