import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Trabajas para una tienda de informática y te encargan crear una base de datos para los nuevos ordenadores que van llegando.

Necesitas crear el objeto Ordenador, con sus atributos correspondientes: marca, modelo, memoria RAM, capacidad del disco duro, precio ... etc (cantidad y tipo de  atributos a tu gusto, pero poner al menos 3).

Debes añadir el método constructor, los getters y setters y el toString(). Recuerda no hacer copiar y pegar, ni buscar ningún método de generación de código automático. Hay que pensar y practicar, al menos por hoy!

Siéntete libre de modificar el toString a tu gusto.

Una vez definida la clase del ordenador, crea al menos 3 instancias y prueba a imprimir los objetos en dos maneras:

1. Todas sus características

2. Imprime solo características sueltas como la marca y el precio del ordenador elegido.

3. Probar a cambiar una propiedad y volver a mostrarla.


         * 
         */
        Ordenador ordenadorTop = new Ordenador("HP", 8, 512, 700);
        //1. Todas sus características
        System.out.println(ordenadorTop.toString());
        System.out.println("El ordenador tiene " + ordenadorTop.getRam() + "Gb de RAM y cuesta solo " + ordenadorTop.getPrecio() + "€");
        //ordenadorTop.setPrecio(599);
        System.out.println("Oferta! Ahora está por: " + ordenadorTop.getPrecio() + "€");
        //Scanner teclado = new Scanner(System.in);
        //System.out.println("¿Quieres hacer una oferta sobre el modelo " + ordenadorTop.getMarca() + "?");
        //if (teclado.nextLine().equalsIgnoreCase("si")) {
        //    System.out.println("¿Qué descuento ");
        //}


      
    }

    //public static void descuento(int descuento, double precioActual) {
        //double offerPrice = precioActual*descuento;
        //return double offerPrice;
        

    //}
}
