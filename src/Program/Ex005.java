package Program;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        /* Faça um programa que leia um número e mostre na tela o seu
        * sucessor e antecessor */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Informe um valor: ");
        num = sc.nextInt();

        System.out.println("Antecessor: " +(num - 1)+"\nSucessor: " +(num + 1));


        sc.close();
    }
}
