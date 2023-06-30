package Program;

import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        /* Crie um algoritimo que leia um número e mostre o
        * seu dobro triplo e raiz quadrada */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um valor: ");
        num = sc.nextInt();

        System.out.println("Aqui está o dobro do valor digitado: " + (num * 2));
        System.out.println("Aqui está o triplo do valor digitado: " + (num * 3));
        System.out.println("Aqui está a raiz do valor digitado: " + Math.pow(num, 2));


        sc.close();
    }
}
