package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {
        /* Faça um algoritimo que leia o preço de um produto e mostre
        * seu novo preço, com 5% de desconto */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double produto, desconto;

        System.out.print("Informe o preço do Produto, Por favor R$ ");
        produto = sc.nextDouble();

        desconto = produto - (produto * 5 / 100);

        System.out.print("O preço do pruduto com 5% de desconto é: "); System.out.printf("R$%.2f", desconto);

        sc.close();
    }
}
