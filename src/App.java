import java.util.Scanner;

public class App {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String opcion = "";
        while (!opcion.equals("0")) {
            System.out.println("################  MENÚ ################");
            System.out.println("####  1. Crear Moto                ####");
            System.out.println("####  2. Crear Carro               ####");
            System.out.println("####  0. Salir                     ####");
            System.out.println("#######################################");
            opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Digite el serial del motor de la moto");
                    String motor = teclado.nextLine();
                    System.out.println("Digite el número de ruedas de la moto");
                    String numRuedas = teclado.nextLine();
                    System.out.println("Digite el color de la moto");
                    String color = teclado.nextLine();
                    System.out.println("Digite el tipo de manillar de la moto");
                    String tipoManillar = teclado.nextLine();
                    System.out.println("Digite el cilindraje de la moto");
                    String cilindraje = teclado.nextLine();
                    Moto miMoto = new Moto(motor, numRuedas, color, tipoManillar, cilindraje);
                    miMoto.arrancar();
                    miMoto.mover();
                    miMoto.hacerCaballito();
                    miMoto.mover();
                    miMoto.detener();
                    System.out.println(miMoto);
                    break;
                case "2":
                    Carro miCarro = new Carro();
                    miCarro.setColor("amarillo");
                    miCarro.setNumEjes("2");
                    System.out.println("El carro es " + miCarro.getColor() +
                            " y tiene " + miCarro.getNumEjes() + " Ejes");
                    miCarro.arrancar();
                    miCarro.mover();
                    miCarro.detener();
                    break;

                default:
                    break;
            }
        }
    }
}
