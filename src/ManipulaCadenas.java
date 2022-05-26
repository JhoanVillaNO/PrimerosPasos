
public class ManipulaCadenas {

    public static void main(String arg[]){
        String nombre = "Zaba";

        System.out.println("Mi Nombre es " + nombre);
        // FUNCION PARA SABER LA CANTIDAD DE LETRAS
        System.out.println("Mi Nombre tiene " + nombre.length() + " letras");

        //FUNCION PARA SABER DONDE ENCONTRAR LA LETRA SEGUN SU POSICION
        System.out.println("La Primera Letra de mi nombre es: " + nombre.charAt(0));

        int ultimaletra;
        //FUNCION PARA SABER ULTIMA LETRA DE UNA CADENA
        ultimaletra = nombre.length();

        System.out.println("Y la Ultima letra es la:  "+nombre.charAt(ultimaletra-1));

    }

}
