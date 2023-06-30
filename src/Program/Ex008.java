package Program;

import java.util.Scanner;
import java.util.Locale;

public class Ex008 {

    public static void main(String[] args){

        /* Escreva um programa que leia o valor e o exiba convertido
        * em centimetros e milimetros */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medida;

        System.out.print("Informe um valor em Metros: ");
        medida = sc.nextDouble();

        System.out.printf("Centímetros: %.2f", (medida * 100));
        System.out.printf("\nMilímetros: %.2f", (medida * 1000));

        sc.close();
    }
}
