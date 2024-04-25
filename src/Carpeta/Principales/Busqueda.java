package Carpeta.Principales;

import com.google.gson.*;
import Carpeta.Principales.Conversor;
import Carpeta.Principales.ConversorRate;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Currency;
import java.util.Locale;
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
        //System.out.println(response.body());



        String json = response.body();
//      System.out.println(json);



        ConversorRate conversores = gson.fromJson(json,ConversorRate.class);

//        Conversor conversor = new Conversor(conversores);
//        System.out.println(conversor.baseCode);


//        FileWriter escritura = new FileWriter("conversor.json");
//        escritura.write(gson.toJson(conversor));
//        escritura.close();

        JsonObject jsonResponse = conversores.conversion_rates();
        JsonPrimitive primitiveResponse = jsonResponse.getAsJsonPrimitive(conversionCurrency);
        return primitiveResponse.getAsDouble();
    }


}
