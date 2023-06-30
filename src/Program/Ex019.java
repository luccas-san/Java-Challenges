package Program;

import java.util.*;

public class Ex019 {

    public static void main(String[] args) {

        /* Um professor quer sortear um dos seus quatro alunos para
        * apagar o quadro. Faça um programa que ajude ele, lendo o nome
        * deles e e escrevendo o nome do esolhido */
        Scanner sc = new Scanner(System.in);

        Random sorteio = new Random();
        List<String> alunos = new ArrayList<>();
        String estudantes;

        System.out.print("Olá, Professor. Quantos nomes quer adicionar no sorteio? ");
        int n = sc.nextInt();
        int qtd[] = new int[n];

        for(int i = 0; i < qtd.length; i++){
           System.out.print("Adicione o Nome do "+ (i + 1) + "° Aluno(a): ");
           estudantes = sc.next();
           alunos.add(estudantes);
        }
        System.out.println();

        System.out.println("Aqui está a Lista de Alunos: ");
        for(int i = 0; i < n; i++){
            System.out.println(alunos.get(i));
        }
        System.out.println("--------------------------");
        System.out.print("O nome sorteado é: ");
        System.out.println(alunos.get(sorteio.nextInt(alunos.size())));

        sc.close();
    }
}
