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
public class problema01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombresEstaciones = new String[5];
        double[][] produccion = new double[5][12];
        double[] sumaProduccion = new double[5];

        for (int i = 0; i < nombresEstaciones.length; i++) {
            System.out.print("Ingrese nombre encargado estación " + (i + 1) + ": ");
            nombresEstaciones[i] = entrada.nextLine();

            for (int j = 0; j < 12; j++) {
                System.out.print("Mes " + (j + 1) + ": ");
                produccion[i][j] = entrada.nextDouble();
            }
            entrada.nextLine(); // Limpiar buffer del scanner
        }

        double suma;
        double mayorProduccion = -1;
        int indiceMejor = -1;
        String reporte = "\nAnálisis de Producción\nEstación\n";

        for (int i = 0; i < produccion.length; i++) { 
            suma = 0;
            for (int j = 0; j < produccion[i].length; j++) { 

                suma = suma + produccion[i][j];
            }
            sumaProduccion[i] = suma;

            if (suma > mayorProduccion) {
                mayorProduccion = suma;
                indiceMejor = i;
            }
        }

        for (int i = 0; i < nombresEstaciones.length; i++) {
            reporte = String.format("%sNombre Estación %d - Total Producción: $ %.0f\n",
                    reporte,
                    (i + 1),
                    sumaProduccion[i]);
        }

        // Agregamos la parte final del ganador al mismo reporte
        reporte = String.format("%s\nEstación más productiva: Nombre Estación %d\n"
                + "Encargado de la estación: %s\n"
                + "Cantidad de la estación más productiva: $ %.0f\n",
                reporte,
                (indiceMejor + 1),
                nombresEstaciones[indiceMejor],
                mayorProduccion);

        System.out.printf("%s", reporte);
    }
}
