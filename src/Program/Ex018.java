package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex018 {

    public static void main(String[] args) {
        /* Faça um programa que leia um ângulo qualquer
        * e mostre na tela o valor do seno, cosseno e tangente
        * desse angulo */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double angulo, seno, cosseno, tangente;

        System.out.print("Informe o Ângulo: ");
        angulo = sc.nextDouble();

        seno = Math.sin(Math.toRadians(angulo));
        System.out.print("O Ângulo de "+ angulo); System.out.printf(" tem o seno de %.2f", seno);

        cosseno = Math.cos(Math.toRadians(angulo));
        System.out.print("\nO Ângulo de "+ angulo); System.out.printf(" tem o Cosseno de %.2f", cosseno);

        tangente = Math.tan(Math.toRadians(angulo));
        System.out.print("\nO Ângulo de "+ angulo); System.out.printf(" tem a Tangente de %.2f", tangente);

        sc.close();
    }
}
