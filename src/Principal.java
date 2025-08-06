import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Conversion conversion = new Conversion();
        RatiosDeConversion ratios;
        double valor;
        Scanner scanner = new Scanner(System.in);
        String json;
        double valor_de_cambio;
        int opcion = 0;
        String menuOpciones = """
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano 
                6) Peso colombiano =>> Dólar
                7) Salir
                """;
    while (opcion != 7) {
        System.out.println("*******************************************************");
        System.out.println("Sea bienvenido/a al Converor de Moneda :]");
        System.out.println(" ");
        System.out.println(menuOpciones);
        System.out.println("*******************************************************");
        System.out.println("Elija una opción válida:");

        try {
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    valor = conversion.ConvertirMoneda("USD", "ARS");
                    System.out.println("Moneda convertida: " + valor + " ARS $");
                    break;
                case 2:
                    valor = conversion.ConvertirMoneda("ARS", "USD");
                    System.out.println("Moneda convertida: " + valor + " US$");

                    break;
                case 3:
                    valor = conversion.ConvertirMoneda("USD", "BRL");
                    System.out.println("Moneda convertida: " + valor + " R$");
                    break;
                case 4:
                    valor = conversion.ConvertirMoneda("BRL", "USD");
                    System.out.println("Moneda convertida: " + valor + " US$");
                    break;
                case 5:
                    valor = conversion.ConvertirMoneda("USD", "COP");
                    System.out.println("Moneda convertida: " + valor + " COP $");
                    break;
                case 6:
                    valor = conversion.ConvertirMoneda("COP", "USD");
                    System.out.println("Moneda convertida: " + valor + " US$");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } catch (InputMismatchException e){
            System.out.println("Entrada no válida. Por favor, ingrese un número del 1 al 7.");
            scanner.next();
        }
    }

        System.out.println("Cerrando Conversor..");
        System.out.println("Finalizado el programa");

    }

}
