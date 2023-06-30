package Program;

import java.util.Scanner;

public class Ex009 {

    public static void main(String[] args) {
        /* Faça um programa que leia um número inteiro qualquer
        * e mostre na tela a sua tabuada */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Informe um valor: ");
        num = sc.nextInt();

        System.out.println("Aqui está a Tabuada: ");
        System.out.println();
        System.out.println(num + " X 1 = " + (num * 1));
        System.out.println(num + " X 2 = " + (num * 2));
        System.out.println(num + " X 3 = " + (num * 3));
        System.out.println(num + " X 4 = " + (num * 4));
        System.out.println(num + " X 5 = " + (num * 5));
        System.out.println(num + " X 6 = " + (num * 6));
        System.out.println(num + " X 7 = " + (num * 7));
        System.out.println(num + " X 8 = " + (num * 8));
        System.out.println(num + " X 9 = " + (num * 9));
        System.out.println(num + " X 10 = " + (num * 10));


        sc.close();
    }
}
