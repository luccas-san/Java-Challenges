package Program;

import java.util.Scanner;

public class Ex025 {

    public static void main(String[] args) {
        /* Faça um programa que leia uma frase inteira pelo teclado
         * e mostre:
         * Quantas vezes aparece a letra 'A'
         * Em que posição ela aparece a primeira vez
         * Em que posição ela aparece a ultima vez*/
        Scanner sc = new Scanner(System.in);

        String frase;
        int letra = 0;

        System.out.print("Digite uma Palavra ou uma Frase de sua preferência: ");
        frase = sc.nextLine().toUpperCase();
        System.out.println("-----------------------------");

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'A'){
                letra += 1;
            }
        }

        System.out.println("Quantidade de letras 'A': "+ letra);
        System.out.println("A Primeira letra 'A' está na posição: "+ frase.indexOf('A'));
        System.out.println("A Última letra 'A' está na posição: "+ frase.lastIndexOf('A'));

        sc.close();
    }
}
