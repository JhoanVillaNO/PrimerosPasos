package poo;

import jdk.security.jarsigner.JarSignerException;

public class Coche {

    public int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoplataforma;
    private String color;
    private String PesoTotal;
    boolean AsientosCueros, climatizador;

    public Coche() {

        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoplataforma = 500;

    }

    //GETTER
    public String ObtenerLargo() {

        return "El largo es: " + largo;
    }

    //SETTER
    public void SetColor(String parcoche) {

        color = parcoche;

    }

    public String ObtenerColor() {

        return "El color del coche es " + color;

    }

    public String ObtenerDatos() {

        return "Plataforma tiene " + ruedas + " " + largo / 1000 + " " + ancho + " " + pesoplataforma;
    }

    public void ConfigurarAsientos(String ParAsientos) {

        if (ParAsientos == "si") {

            this.AsientosCueros = true;

        }else{
            this.AsientosCueros = false;
        }

    }

    public String ObtenerAsientos(){

        if(AsientosCueros==true){

            return "El coche tiene asientos de cuero";
        }else{
            return "No tiene asientos";
        }
    }

    public void ConfigurarClimatizador(String climatizador) {

        if (climatizador == "si") {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String ObtenerPeso(){

          int pesocarroceria = 500;
          pesoplataforma = pesocarroceria+pesocarroceria;
          if(AsientosCueros==true){
              pesoplataforma=pesoplataforma+50;
          }

          return "El peso es" +pesocarroceria;
        }

        public int PrecioCoche(){
            int preciofinal = 10000;

            if(AsientosCueros==true){
                preciofinal+=2000;
            }
            if(climatizador == true){
                preciofinal+=1500;
            }
            return preciofinal;
        }
    }
