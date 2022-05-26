package graficos;

import javax.swing.*;

public class MarcoMenu {

    public static void main(String args[]) {

        menuFrame menu = new menuFrame();
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
    }

}

    class menuFrame extends JFrame {
        public menuFrame() {
            setBounds(500, 300, 550, 400);
            menuLamina milamina = new menuLamina();
            add(milamina);
            setVisible(true);

        }

        class menuLamina extends JPanel {

            public menuLamina() {

                JMenuBar barra = new JMenuBar();
                JMenu archivo = new JMenu("Archivo");
                JMenu edicion = new JMenu("Edicion");
                JMenu herramientas = new JMenu("Herramientas");
                JMenu opciones = new JMenu(("Opciones"));
                JMenuItem guardar = new JMenuItem("Guardar");
                JMenuItem guardarComo = new JMenuItem("Guardar Como");
                JMenuItem cortar = new JMenuItem("Cortar");
                JMenuItem copiar = new JMenuItem("Copiar");
                JMenuItem pegar = new JMenuItem("Pegar");
                JMenuItem generales = new JMenuItem("Generales");
                JMenuItem op1 = new JMenuItem("Opcion 1");
                JMenuItem op2 = new JMenuItem("Opcion 2");

                archivo.add(guardar);
                archivo.add(guardarComo);
                edicion.add(copiar);
                edicion.add(pegar);
                edicion.add(cortar);
                opciones.add(op1);
                opciones.add(op2);
                edicion.add(opciones);


                herramientas.add(generales);

                barra.add(archivo);
                barra.add(edicion);
                barra.add(herramientas);

                add(barra);

            }

        }

    }
