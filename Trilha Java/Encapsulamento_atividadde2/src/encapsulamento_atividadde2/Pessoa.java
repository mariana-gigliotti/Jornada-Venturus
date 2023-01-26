
package encapsulamento_atividadde2;

import java.util.Random;
import java.util.Scanner;

public class Pessoa {
    
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    
    private String nome, sobrenome;
    private int inscricao;
    Endereco end;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getInscricao() {
        return inscricao;
    }

    private void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    
    public void Cadastrar () {
        
        int num = rn.nextInt(99 - 00 + 1);
        this.setInscricao(num);
        
        System.out.println("Digite o nome:");
        this.nome = sc.nextLine();
        
        System.out.println("Digite o sobrenome:");
        this.sobrenome = sc.nextLine();
        
    }

    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("Inscrição: " + this.inscricao);
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
        System.out.println("Endereço: ");
        this.end.apresentar();
    }
    
}
