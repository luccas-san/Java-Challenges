package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex016 {

    public static void main(String[] args) {

        /* Crie um programa que leia um número real qualquer pelo teclado
         * e mostre na tela a sua porção inteira
         *
         * Ex: digite um número: 6.127
         * O numero 6.127 tem a parte inteira 6 */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.print("Informe um valor: ");
        num = sc.nextDouble();

        System.out.printf("Valor: %.0f", num);

        sc.close();

    }
}
