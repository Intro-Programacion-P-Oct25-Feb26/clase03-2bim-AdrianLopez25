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
        double[] suma_produccion = new double[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese nombre encargado estación " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();

            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                produccion[i][j] = entrada.nextDouble();
            }
        }
        double mayor = 0;
        int posicion_ganador = 0;

        for (int i = 0; i < 5; i++) {
            double suma_fila = 0;


            for (int j = 0; j < 12; j++) {
                suma_fila = suma_fila + produccion[i][j];
            }

        }
    }
    }

