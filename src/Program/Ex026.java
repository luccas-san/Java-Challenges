package Program;

import java.util.Scanner;

public class Ex026 {

    public static void main(String[] args) {
    /*Faça um Programa que leia o nome completo de uma Pessoa,
    * mostrando em seguida o primeiroe o ultimo nome separadamente */

        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.print("Por favor, Informe o seu Nome Completo: ");
        nome = sc.nextLine().toUpperCase();

        String[] partes = nome.split(" ");
        int qtd = partes.length;

        System.out.println("O seu Nome Completo é: " + nome);
        System.out.println("O seu Primeiro Nome é: " + nome.split(" ")[0]);
        System.out.println("O seu Último Nome é: " + partes[qtd - 1]);

        sc.close();
    }

}
