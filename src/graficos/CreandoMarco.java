package graficos;

import javax.swing.*;

public class CreandoMarco {

    public static void main(String args[]){

        miMarco ventana = new miMarco();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class miMarco extends JFrame{

    public miMarco(){
        //setSize(500,300);
        //setLocation(500,300);
        setBounds(500,300,250,250);
        //setResizable(false);
        //setExtendedState(6);
        setTitle("Ventana de apoyo");
    }
}
