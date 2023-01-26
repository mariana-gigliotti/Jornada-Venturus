package objetoeclasse_atividade7;

import java.util.Scanner;

public class ObjetoeClasse_atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Estudante aluno1 = new Estudante();
        
        System.out.println("Digite o nome do aluno(a):");
        aluno1.nome = sc.next();
        System.out.println("Digite as notas do aluno(a):");
        System.out.println("Notas do primeiro trimestre:");
        aluno1.nota1 = sc.nextInt();
        System.out.println("Notas do segundo trimestre:");
        aluno1.nota2 = sc.nextInt();
        System.out.println("Notas do terceiro trimestre:");
        aluno1.nota3 = sc.nextInt();
        
        aluno1.avaliação();
        
    }
    
}
