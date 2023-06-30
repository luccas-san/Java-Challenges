package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {

    public static void main(String[] args) {
        /* Faça um programa que leia a altura e a largura de uma area de uma parede
        * em metros, calcule a sua area  e a quantidade de tinta para pinta-la
        * sabendo que cada litro de tinta pinta uma area de de 2m² */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double altura, largura, area, tinta;

        System.out.println("Informe a Altura e a Largura da Parede em M: ");
        altura = sc.nextDouble();
        largura = sc.nextDouble();

        area = altura * largura;
        tinta = area / 2;

        System.out.println("A área da parede é de: "+ area + "M");
        System.out.printf("Voce vai precisar de: %.2f", tinta); System.out.print(" l de tinta");

        sc.close();
    }
}
