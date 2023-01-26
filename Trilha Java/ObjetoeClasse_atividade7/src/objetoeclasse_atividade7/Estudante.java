package objetoeclasse_atividade7;

class Estudante {
    String nome;
    int nota1, nota2, nota3;
    
    void avaliação (){
        int nota_final = this.nota1 +this.nota2 + this.nota3;
        System.out.println("Nome:" + this.nome);
        if (nota_final >= 60) {
            System.out.println("Aluno(a) APROVADO(A)");
        }else {
            int nota_faltando = 60 - nota_final;
            System.out.println("Aluno(a) REPROVADO(A)");
            System.out.println("Falntam " + nota_faltando + " pontos.");
        }
    }
}
