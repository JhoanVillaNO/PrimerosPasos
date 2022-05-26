package poo;

public class UsoVehiculo {

    public static void main (String args[]){

      /*Coche objcoche = new Coche();
      objcoche.SetColor("Verde");

        System.out.println(objcoche.ObtenerDatos());

        System.out.println(objcoche.ObtenerColor());

        objcoche.ConfigurarAsientos("si");

        System.out.println(objcoche.ObtenerAsientos());

        objcoche.ConfigurarAsientos("no");

        System.out.println(objcoche.ObtenerAsientos());

        objcoche.ConfigurarClimatizador("si");*/


      Coche coche1 = new Coche();

      coche1.SetColor("Blanco");

      furgoneta furgoneta1 = new furgoneta(7,580);

      furgoneta1.SetColor("Azul");

      furgoneta1.ConfigurarAsientos("si");
      furgoneta1.ConfigurarClimatizador("si");

      System.out.println(furgoneta1.ObtenerColor());

      System.out.println(furgoneta1.getDatoFurgoneta()+ "  "+furgoneta1.ObtenerDatos());

    }
}
