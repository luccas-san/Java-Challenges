package Program;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        /* Faça um prorgama que leia pelo teclado e mostre na tela o seu tipo primitivo
        * e as informações possiveis sobre ele */

        Scanner sc = new Scanner(System.in);

        String palavra;
        System.out.print("Digite qualquer palavra para vê-la modificada: ");
        palavra = sc.nextLine();

        // Código para Capitalizar uma palavra:
        String cap = palavra.substring(0, 1).toUpperCase();
        String capitalize = cap + palavra.substring(1);

        System.out.println("Modificação: ");
        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
        System.out.println(capitalize);
        System.out.println("Quantidade de caracteres -> " + palavra.length());

        sc.close();
    }
}
