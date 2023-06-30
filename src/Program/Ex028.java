package Program;

import java.util.Scanner;
import java.util.Locale;

public class Ex028 {
    public static void main(String[] args) {
        /* Escreva um programa que leia a velocidade de um carro.
        * Se ele ultrapassar 80km/h, mostre uma mensagem dizendo que
        * ele foi  multado.
        * A multa vai custar R$7,00 por cada Km acima limite.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int velocidade, resto, velocidade_permitida = 80;
        double multa = 7.00;

        System.out.print("Por favor, Informe a velocidade do Veículo: ");
        velocidade = sc.nextInt();

        System.out.println();

        if(velocidade <= 80) {
            System.out.println("Você é um cidadão exemplar. Você não foi Multado!");
        } else {
            System.out.println(("Você estava acima da velocidade permitida. Você foi Multado!"));
            resto = velocidade - velocidade_permitida;
            System.out.printf("O valor da Multa é de R$%.2f", (resto * multa));
        }

        sc.close();
    }
}
