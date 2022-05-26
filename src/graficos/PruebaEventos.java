package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {

    public static void main(String args[]){

        marcoBotones mimarco= new marcoBotones();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class marcoBotones extends JFrame {

    public marcoBotones(){

        setTitle("Botones y eventos");
        setBounds(700,300,500,300);
        LaminaBotones miLamina = new LaminaBotones();
        add(miLamina);

    }
}

class LaminaBotones extends JPanel implements ActionListener {

    JButton botonAzul= new JButton("Azul");
    JButton botonAmarillo= new JButton("Amarillo");
    JButton botonRojo= new JButton("Rojo");

    public LaminaBotones(){

        add(botonAzul);
        botonAzul.addActionListener(this);
        add(botonAmarillo);
        botonAmarillo.addActionListener(this);
        add(botonRojo);
        botonRojo.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){

        Object botonPulsado=e.getSource();

        if(botonPulsado==botonAzul) {
            setBackground(Color.blue);
        } else if (botonPulsado == botonAmarillo) {
            setBackground(Color.yellow);
        }else{
            setBackground(Color.red);
        }
    }
}
