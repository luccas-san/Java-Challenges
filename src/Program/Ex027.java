package Program;

import java.util.Scanner;
import java.util.Random;

public class Ex027 {

    public static void main(String[] args) {
        /* Escreva um programa que faça o computador "pensar" em um número
        * inteiro e peça para o usuário tentar descobrir qual foi o número
        * escolhido pelo computador.
        *
        * O programa devera escrever na tela se o usuário venceu ou perdeu*/
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numero, cont = 0;

        System.out.println("Vamos Jogar? Estou pensando em um número entre 0 e 5!");
        System.out.println("Consegue adivinhar qual número é? ");
        numero = sc.nextInt();
        cont += 1;
        int number = random.nextInt(6);

        while(numero != number) {
            System.out.println("Você errou. Tente outra vez!");
            numero = sc.nextInt();
            cont += 1;
            if(numero == number) {
                System.out.println("Parabéns, você conseguiu acertar na "+ cont +"° Tentativa!");
                break;
            } else if (cont == 3) {
                System.out.println("Sinto Muito. Você perdeu todas as suas vidas...");
                System.out.println("Eu tinha pensado no número "+ number);
                System.out.println("GAME OVER...");
                break;
            } else if(numero > 5) {
                System.out.println("Valor INVÁLIDO! Informe um número entre 0 e 5");
            }
        }
        sc.close();
    }
}
