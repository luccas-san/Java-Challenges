package Program;

import java.util.Scanner;

public class Ex024 {

    public static void main(String[] args) {
        /* Crie um programa que leia o nome de uma pessoa e diga
         * se ela tem 'Silva' no nome */
        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.print("Informe seu Nome Completo, por favor: ");
        nome = sc.nextLine().toLowerCase();

        if(nome.contains("silva")){
            System.out.println("Você possui 'Silva' no seu Nome Completo.");
        } else {
            System.out.println("Você não possui 'Silva' no seu Nome Completo. ");
        }

        sc.close();
    }
}
