package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex015 {

    public static void main(String[] args) {

        /* Escreva um programa que pergunte a quantidade de km percorridos
        * por um carro alugado e a quantidade de dias pelos quais ele foi
        * alugado. Calcule o preço a pagar, sabendo que o carro custa R$60 por dia
        * e R$0,15 por km rodado. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price_dia = 60.0;
        double price_km = 0.15;

        int qtd_dias, qtd_km;
        double total_dias, total_km, total;

        System.out.println("Informe quantos dias você ficou com o veículo: ");
        qtd_dias = sc.nextInt();

        System.out.println("Informe a quantidade de quilômentros percorridos: ");
        qtd_km = sc.nextInt();

        total_dias = qtd_dias * price_dia;
        total_km = qtd_km * price_km;

        total = total_dias + total_km;

        System.out.printf("O valor total a pagar é de R$%.2f", total);


        sc.close();
    }
}
