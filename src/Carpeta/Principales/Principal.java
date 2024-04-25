package Carpeta.Principales;

import java.io.IOException;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;


public class Principal {

   public static Busqueda busqueda;
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        double conversion = 0;
        busqueda = new Busqueda();
        boolean salir = false;
        String tasa = "";
        String nombre = "";
        String simbolos = "";

        System.out.println("Bienvenido al conversor de monedas, ingrese un numero: ");

        while (salir == false){
            System.out.println("\n ************************");
            System.out.println("Seleccione el tipo de moneda que desea convertir: ");
            System.out.println("1. Dolares" + "\n" + "2. Pesos Colombianos"+ "\n"+ "3. Reales Brasileños" + "\n" + "0. Para salir");
            int opcion = scanner.nextInt();
         if (opcion == 0){
             break;
         }
            System.out.println("Seleccione el tipo de moneda a la que desea convertir: ");
            System.out.println("1. Dolares" + "\n" + "2. Pesos Colombianos"+ "\n"+ "3. Reales Brasileños" + "\n" + "0. Para salir");

            int conversor = scanner.nextInt();
            String convertir =  "";
            if (conversor == 0){
                break;
            }
            if (opcion == conversor){
                System.out.println("Este cambio de moneda no puede ser realizado, ya que esta intentando convertitr la moneda al mismo tipo de moneda.");
                break;

            }
            switch (conversor){
                case 1:
                    convertir = "USD";
                    nombre = "Dolares";
                    simbolos = "$";
                    break;
                case 2:
                    convertir = "COP";
                    nombre = "Pesos colombianos";
                    simbolos = "$";
                    break;
                case 3:
                    convertir = "BRL";
                    nombre = "Reales";
                    simbolos = "ℝ";
                    break;
            }


            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la cantidad de dolares: ");
                    double dolares = scanner.nextDouble();
                    tasa = "USD";
                    conversion = busqueda.conversion(tasa, convertir);
                    System.out.println("La conversion de Dolares a " + nombre + " es: " + simbolos + " "  + (conversion * dolares ));
                    break;

                case 2:
                    System.out.println("Ingresa la cantidad de Pesos colombianos: ");
                    double pesos = scanner.nextDouble();
                    tasa = "COP";
                    conversion = busqueda.conversion(tasa, convertir);
                    System.out.println("La conversion de Pesos colombianos a " + nombre + " es: " + simbolos + " " +  (conversion * pesos ));
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad de Reales: ");
                    double reales = scanner.nextDouble();
                    tasa = "BRL";
                    conversion = busqueda.conversion(tasa, convertir);
                    System.out.println("La conversion de Reales a "+ nombre + " es: " + simbolos + " "  + (conversion * reales ));
                    break;

            }

        }



    }

}
