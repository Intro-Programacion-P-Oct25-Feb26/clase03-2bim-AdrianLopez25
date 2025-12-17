/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;
import java.util.Scanner;
/**
 *
 * @author PERSONAL
 */
public class Problema01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        String[] nombres = new String[5];
        double[][] produccion = new double[5][12];
        

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese nombre encargado estación " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();

            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                produccion[i][j] = entrada.nextDouble();
            }
            
            entrada.nextLine(); 
        }

        double mayor_venta = 0; 
        int posicion = 0;

        System.out.println("\nAnalasis de Produccion");
        System.out.println("Estacion");

        for (int i = 0; i < 5; i++) {
            double suma_fila = 0;

            for (int j = 0; j < 12; j++) {
                suma_fila = suma_fila + produccion[i][j];
            }

            System.out.printf("%s Estación %d - Total Produccion: $ %.0f\n", 
                             nombres[i],i+1, suma_fila);


            if (suma_fila > mayor_venta) {
                mayor_venta = suma_fila;
                posicion = i; 
            }
        }

        System.out.printf("\nEstación más productiva: Nombre Estación %d\n"
                + "Encargado de la estación: %s\n"
                + "Cantidad de la estación más productiva: $ %.0f\n", 
                (posicion + 1), 
                nombres[posicion], 
                mayor_venta);
    }
}

