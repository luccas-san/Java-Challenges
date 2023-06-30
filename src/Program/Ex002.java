package Program;

import java.util.Scanner;

public class Ex002 {

    public static void main(String[] args) {

        /* Cria um script Java que leia o dia, o mês e o ano de nascimento
        * de uma pessoa e mostre uma mensagem com a data formatada */

        Scanner sc = new Scanner(System.in);

        int dia, ano;
        String mes;

        System.out.print("Informe o dia do seu Nascimento: ");
        dia = sc.nextInt();
        sc.nextLine();

        System.out.print("Escreva o mês do seu Nascimento: ");
        mes = sc.next();

        System.out.print("Informe o ano do seu Nascimento: ");
        ano = sc.nextInt();


        System.out.print("Você nasceu no dia "+ dia + " de "+ mes + " de " + ano);


        sc.close();
    }
}
