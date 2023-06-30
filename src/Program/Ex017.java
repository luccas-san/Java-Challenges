package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {

        /*Faça um programa que leia o comprimento do cateto oposto
        * e do cateto adjacente de um triângulo e mostre o comprimento
        * da hipotenusa. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double co, ca, hi;

        System.out.print("Informe a medida do Cateto Oposto: ");
        co = sc.nextDouble();

        System.out.print("Informe a medida do Cateto Adjacente: ");
        ca = sc.nextDouble();

        double calc = Math.pow(co, 2) + Math.pow(ca, 2);

        hi = Math.sqrt(calc);

        System.out.printf("A Hipotenusa é: %.2f", hi);

        sc.close();
    }
}
