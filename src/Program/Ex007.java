package Program;

import java.util.Scanner;
import java.util.Locale;

public class Ex007 {

    public static void main(String[] args){

        /* Desenvolva um programa que leia duas notas de um aluno,
        * calcule e mostre a sua média*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Informe duas notas de um Aluno para ver a sua média: ");
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("MÉDIA FINAL: %.2f", media);

        sc.close();
    }
}
