package Program;

import java.util.Locale;
import java.util.Scanner;

public class Ex013 {

    public static void main(String[] args) {

        /* Faça um algoritimo que leia o salario de um funcionario e mostre
        * seu novo salario, com 15% de aumento */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, reajuste;

        System.out.println("Informe o salário do funcionario para ser reajustado: ");
        salario = sc.nextDouble();

        reajuste = salario + (salario * 15 / 100);

        System.out.print("O salário do funcionário foi reajustado em 15% \n");
        System.out.printf("R$%.2f", reajuste);

        sc.close();
    }
}
