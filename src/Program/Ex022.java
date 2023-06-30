package Program;

import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {
        /* Faça um programa que leia um número de 0 a 9999
         * e mostre na tela cada um dos seus digitos separados.
         *
         * Ex: Digite o número: 1834
         * Unidade: 4
         * Dezena: 3
         * Centena: 8
         * Milhar: 1*/

        Scanner sc = new Scanner(System.in);

        int numero, u, d, c, m;

        System.out.println("Por favor, Informe um número entre 0 e 9999: ");
        numero = sc.nextInt();

        u = numero / 1 % 10;
        d = numero / 10 % 10;
        c = numero / 100 % 10;
        m = numero / 1000 % 10;

        System.out.println("Unidade: " + u);
        System.out.println("Dezena: " + d);
        System.out.println("Centena: " + c);
        System.out.println("Milhar: " + m);


        sc.close();
    }
}
