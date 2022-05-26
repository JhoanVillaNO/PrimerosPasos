package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcesadorTexto {

    public static void main(String args[]){

        MenuProcesador_II mimarco= new MenuProcesador_II();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcesador_II extends JFrame{

    public MenuProcesador_II(){

        setBounds(500,300,550,600);
        LaminaProcesador_II milamina = new LaminaProcesador_II();
        add(milamina);
        setVisible(true);

    }

}

class LaminaProcesador_II extends JPanel {

    public LaminaProcesador_II() {

        setLayout(new BorderLayout());
        JPanel laminamenu = new JPanel();
        JMenuBar mibarra = new JMenuBar();
        //----------------------------------------
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamaño");

        configuraMenu("Arial","fuente","Arial",9,10);
        configuraMenu("Courier","fuente","Courier",9,10);
        configuraMenu("Verdana","fuente","Verdana",9,10);
        //----------------------------------------
        configuraMenu("Negrita","estilo","",Font.BOLD,1);
        configuraMenu("Cursiva","estilo","",Font.ITALIC,1);

        //---------------------------------------------------------------
        configuraMenu("12","tamaño","",1,12);
        configuraMenu("16","tamaño","",1,16);
        configuraMenu("20","tamaño","",1,20);
        configuraMenu("24","tamaño","",1,24);
        //----------------------------------------------------------------

        mibarra.add(fuente);
        mibarra.add(estilo);
        mibarra.add(tamanio);
        laminamenu.add(mibarra);
        add(laminamenu, BorderLayout.NORTH);
        miarea = new JTextPane();
        add(miarea, BorderLayout.CENTER);
    }

    public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {

        JMenuItem elemMenu = new JMenuItem(rotulo);

        if (menu == "fuente") {
            fuente.add(elemMenu);
        } else if (menu == "estilo") {
            estilo.add(elemMenu);
        } else if (menu == "tamaño") {
            tamanio.add(elemMenu);
        }

        elemMenu.addActionListener(new gestionaEventos(rotulo,tipoLetra, estilos, tam));

    }

    private class gestionaEventos implements ActionListener {

        String tipoTexto, menu;
        int estiloLetra, tamanioLetra;

        public gestionaEventos (String elemento,String texto2, int estilo2,int tamLetra){
            tipoTexto=texto2;
            estiloLetra=estilo2;
            tamanioLetra= tamLetra;
            menu=elemento;

        }


        @Override
        public void actionPerformed(ActionEvent e) {

            letras=miarea.getFont();
            if(menu=="Arial" || menu=="Courier"|| menu == "Verdana"){
                estiloLetra=letras.getStyle();
                tamanioLetra=letras.getSize();
            } else if (menu=="Cursiva"|| menu == "Negrita") {
                tipoTexto=letras.getFontName();
                tamanioLetra=letras.getSize();
            } else if (menu=="12"||menu=="16"||menu=="20"||menu=="24") {
                estiloLetra=letras.getStyle();
                tipoTexto=letras.getFontName();
            }
            miarea.setFont(new Font(tipoTexto,estiloLetra,tamanioLetra));
        }
    }


    JTextPane miarea;
    JMenu fuente, estilo, tamanio;
    Font letras;
}