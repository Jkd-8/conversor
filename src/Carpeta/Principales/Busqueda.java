package Carpeta.Principales;

import com.google.gson.*;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class Busqueda {
    public double conversion(String targetCurrency, String conversionCurrency) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Gson gson = new Gson();


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create( "https://v6.exchangerate-api.com/v6/29ad82a2a6fd68e001af3c2f/latest/" + targetCurrency))
                .build();

        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());




        String json = response.body();

        ConversorRate conversores = gson.fromJson(json,ConversorRate.class);


        JsonObject jsonResponse = conversores.conversion_rates();
        JsonPrimitive primitiveResponse = jsonResponse.getAsJsonPrimitive(conversionCurrency);
        return primitiveResponse.getAsDouble();
    }


}
