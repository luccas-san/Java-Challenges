package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {

        /* Crie um programa que leia quanto dinheiro uma tem na carteira
        * e mostre quantos dólares ela pode comprar
        *
        * Considere: US$1.00 = R$4.82 - 2023*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double reais;
        double dolar = 4.82;

        System.out.println("Por favor, informe quantos reais você tem na carteira: ");
        reais = sc.nextDouble();

        System.out.printf("Com R$%.2f", reais); System.out.printf(", você pode comprar US$%.2f", (reais / dolar));

        sc.close();


    }
}
