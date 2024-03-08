package Proyectos.Java;
import java.util.Scanner;

public class SueldoObreros {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horastrabajadas, total, horasextra, obreros;
        total = 0;
        obreros = 0;
        System.out.println("Ingresa el número de obreros: ");
        obreros = entrada.nextInt();
        do {
            System.out.println("Ingresa el número de horas trabajadas por trabajador: ");
            horastrabajadas = entrada.nextInt();
            if (horastrabajadas <= 40) {
                total = horastrabajadas * 20000;
            } else {
                horasextra = horastrabajadas - 40;
                total = (horasextra * 20000) + (40 * 25000);
            }
            System.out.println("");
            System.out.println("Su sueldo es de $:" + total);
            System.out.println("");
            obreros = obreros - 1;
        } while (obreros != 0);
        entrada.close();
    }
}