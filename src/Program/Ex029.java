package Program;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        /* Crie um programa que leia um número inteiro e mostre
        * na tela se ele é PAR ou IMPAR */
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Informe um valor para descobrir se ele é PAR ou IMPAR: ");
        numero = sc.nextInt();

        if((numero % 2) == 0) {
            System.out.println("O número que você digitou é PAR!");
        } else {
            System.out.println("O número que você digitou é IMPAR!");
        }


        sc.close();
    }
}
