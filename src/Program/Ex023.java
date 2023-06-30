package Program;

import java.util.Scanner;

public class Ex023 {

    public static void main(String[] args) {
        /* Crie um programa que leia o nome de
        * uma cidade e diga se ela começa ou não com 'Santo'. */

        Scanner sc = new Scanner(System.in);

        String cidade;

        System.out.println("Por favor, Informe o Nome de qualquer Cidade: ");
        cidade = sc.nextLine().toLowerCase();

        if(cidade.split(" ")[0].contains("santo")) {
            System.out.println("A Cidade Informada tem 'Santo' no Inicio do Nome.");
        } else {
            System.out.println("A Cidade Informada não tem 'Santo' no Inicio do Nome.");
        }

        sc.close();
    }
}
