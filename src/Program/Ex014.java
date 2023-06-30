package Program;

import java.util.Scanner;

public class Ex014 {

    public static void main(String[] args) {

        /* Escreva um programa que converta uma temperatura digitada
        * em °C e converta para °F */
        Scanner sc = new Scanner(System.in);

        double c, f;

        System.out.println("Informe a temperatura em °C ");
        c = sc.nextDouble();

        f = (9 * c) / 5 + 32;

        System.out.printf("A temperatura convertida para °F é de: %.1f", f);
        sc.close();
    }
}
