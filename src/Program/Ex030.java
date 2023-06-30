package Program;

import java.util.Scanner;
import java.util.Locale;

public class Ex030 {
    public static void main(String[] args) {
        /* Desenvolva um programa que pergunte a distância de uma viagem
        * em km, calcule o preço da passagem, cobrando 0.50 centavos por km
        * percorrido para viagens de até 200km e 0.45 para viagens mais longas*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int viagem_km;

        System.out.print("Por favor, Informe a distância percorrida (em KM): ");
        viagem_km = sc.nextInt();

        System.out.println();

        if(viagem_km <= 200) {
            System.out.println("O valor Informado foi: "+ viagem_km + "KM.");
            System.out.printf("O valor a pagar é de R$%.2f",(viagem_km * 0.50));
        } else {
            System.out.println("O valor Informado foi: "+ viagem_km + "KM. Você obteve redução no custo da viagem.");
            System.out.printf("O valor a pagar é de R$%.2f",(viagem_km * 0.45));
        }


        sc.close();
    }
}
