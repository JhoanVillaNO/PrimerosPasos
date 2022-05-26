package poo;

public class furgoneta extends Coche {

    private  int capacidadextra;
    private  int plazasextra;


    public furgoneta(int plaextra, int capaextra){

        super();//LLAMA LO DEL CONSTRUCTOR PADRE
        plazasextra=plaextra;
        capacidadextra=capaextra;
    }


    public String getDatoFurgoneta(){

        return "La capacidad de cargas es "+capacidadextra+ " Y las plazas son  "+plazasextra;

    }

}
