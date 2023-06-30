package Program;

import java.util.*;

public class Ex020 {

    public static void main(String[] args){

        /* O mesmo professor do desafio anterior quer sortear a ordem
         * de apresentação de trabalhos dos alunos. Faça um programa que
         * leia o nome dos N alunos e mostre a ordem sorteada */
        Scanner sc = new Scanner(System.in);

        List<String> alunos = new ArrayList<>();

        int n;
        String estudantes;

        System.out.println("Olá, Professor(a). Quantos nomes deseja adicionar ao sorteio? ");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Informe o nome do "+ (i + 1) + "° Aluno: ");
            estudantes = sc.next();
            alunos.add(estudantes);
        }
        System.out.println("---------------------------------");
        Collections.shuffle(alunos);

        System.out.println("Aqui está a ordem de apresentação: ");
        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + "° " + alunos.get(i));
        }

        sc.close();
    }
}
