package Program;

import java.util.Scanner;

public class Ex021 {

    public static void main(String[] args) {
    /*Crie um programa que leia o nome completo de uma
    *pessoa e mostre:
    *
    *O nome de todas as letras maiusculas
    *O nome com todas as letras minusculas
    *Quantas letras tem ao todo sem considerar espaços
    *Quantas letras tem o primeiro nome */

        Scanner sc = new Scanner(System.in);

        String nome, primeiro_nome;
        int no_espace;
        String espace = " ";

        System.out.print("Informe o seu Nome Completo: ");
        nome = sc.nextLine();

        System.out.println("Nome com Maiusculas: " + nome.toUpperCase());
        System.out.println();
        System.out.println("Nome com Minusculas: " + nome.toLowerCase());
        System.out.println();

        primeiro_nome = nome.split(" ")[0];
        no_espace = nome.replace(" ", "").length();

        System.out.println("Quantidade de caracteres: " + no_espace);
        System.out.println();
        System.out.println("O primeiro nome tem: "+ primeiro_nome.length() + " letras");

        sc.close();
    }
}
