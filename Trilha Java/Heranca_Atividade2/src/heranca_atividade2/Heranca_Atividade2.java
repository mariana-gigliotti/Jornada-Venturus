package heranca_atividade2;

public class Heranca_Atividade2 {

    public static void main(String[] args) {
        Homem h1 = new Homem();
        Cao c1 = new Cao();
        
        c1.nome = "floco";
        c1.comer();
        c1.idade = 10;
        c1.fome = true;
        c1.comer();
        
        System.out.println(h1.getNome());
        
    }
    
}
