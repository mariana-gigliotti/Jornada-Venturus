package repetição_desafio;

import java.util.Scanner;

public class Repetição_Desafio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n_alunos, count, voto;
        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, voto5 = 0;
        String nome;
        String candidatos[] = new String[5];
        
        count = 0;
        
        do {
            System.out.printf("Digite o nome do %dº cndidato:%n", count+1);
            nome = sc.next();
            candidatos[count] = nome;
            count++;

        }while (count <= 4);
        
        System.out.println("Quantos alunos há na turma:");
        n_alunos = sc.nextInt();
        
        System.out.println("Vamos começar a votação!");
        
        
        
        count = 1;
        while (count <= n_alunos){
            System.out.printf("Digite 1 para %s%n", candidatos[0]);
            System.out.printf("Digite 2 para %s%n", candidatos[1]);
            System.out.printf("Digite 3 para %s%n", candidatos[2]);
            System.out.printf("Digite 4 para %s%n", candidatos[3]);
            System.out.printf("Digite 5 para %s%n", candidatos[4]);
            
            System.out.println("Escolha se candidato:");
            
            voto = sc.nextInt();
            
            switch (voto){
                case 1 -> voto1++;
                case 2 -> voto2++;
                case 3 -> voto3++;
                case 4 -> voto4++;
                case 5 -> voto5++;
                default -> System.out.println("Voto Inválido");
            }
            count++;
            
        }
        
        if((voto1 > voto2) && (voto1 > voto3) &&(voto1 > voto4) && (voto1 > voto5)){
            System.out.println("Candidato Eleito: " + candidatos[0]);
        }else if ((voto2 > voto3) && (voto2 > voto4) && (voto2 > voto5)){
            System.out.println("Candidato Eleito: " + candidatos[1]);
        }else if ((voto3 > voto4) && (voto3 > voto5)){
            System.out.println("Candidato Eleito: " + candidatos[2]);
        }else if ((voto4 > voto5)){
            System.out.println("Candidato Eleito: " + candidatos[3]);
        }else {
            System.out.println("Candidato Eleito: " + candidatos[4]);
        }
        
        System.out.println("Votação:");
        System.out.printf("%s recebeu %d votos%n", candidatos[0], voto1);
        System.out.printf("%s recebeu %d votos%n", candidatos[1], voto2);
        System.out.printf("%s recebeu %d votos%n", candidatos[2], voto3);
        System.out.printf("%s recebeu %d votos%n", candidatos[3], voto4);
        System.out.printf("%s recebeu %d votos%n", candidatos[4], voto5);
    }   
}
    


