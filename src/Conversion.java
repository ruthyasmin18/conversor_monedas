import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversion {
    private String valoresConversion;
    String API_key = "f10d6cee733a84653996c931"; //-> AQUI CAMBIEN POR EL API_KEY QUE GENERASTE
    Scanner scanner = new Scanner(System.in);

    public RatiosDeConversion obtenerTasasDeCambio(String pais_origen) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API_key + "/latest/" + pais_origen);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        RatiosDeConversion ratios = new Gson().fromJson(response.body(), RatiosDeConversion.class);

        return ratios;
    }

    public double buscaTasaDeCambio(RatiosDeConversion ratios, String pais_destino) {
        double valor = ratios.conversion_rates().get(pais_destino);
        return valor;
    }

    public double ConvertirMoneda(String pais_origen, String pais_destino) throws IOException, InterruptedException {
        System.out.println("Ingrese el valor en " + pais_origen + " que desea convertir en " + pais_destino + " : ");
        double monedaConvertida = 0;
        try {
            double valorPorConvertir = scanner.nextDouble();
            RatiosDeConversion ratios = obtenerTasasDeCambio(pais_origen);
            double valorDeCambio = buscaTasaDeCambio(ratios, pais_destino);
            monedaConvertida  = valorPorConvertir * valorDeCambio;
        } catch (InputMismatchException e) {
            System.out.println("Monto no válido, ingrese un numero.");
            scanner.next();
            ConvertirMoneda(pais_origen, pais_destino);
        }
        return monedaConvertida;
    }
}
