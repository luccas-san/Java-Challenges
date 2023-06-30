package Program;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {

        /* Crie um script em Java que leia o nome da Pessoa e Mostre uma Mensagem de Boas Vindas
        * de acordo com o valor digitado */

        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.print("Qual é o seu Nome? ");
        nome = sc.next();

        System.out.println("Olá, "+ nome + "! Prazer em te conhecer!");


        sc.close();

    }
}
