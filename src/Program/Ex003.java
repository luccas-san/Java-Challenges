package Program;

import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args){

        /* Crie um script em Java que leia dois números e tente mostrar a soma entre eles */

        Scanner sc = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Informe dois valores abaixo para saber a Soma: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        soma = n1 + n2;

        System.out.println("O Resultado da Soma é: "+ soma);

        sc.close();
    }
}
