package heranca_atividade2;

public class Heranca_Atividade2 {

    public static void main(String[] args) {
        Homem h1 = new Homem();
        Cao c1 = new Cao();
        Papagaio p1 = new Papagaio();
        Gato g1 = new Gato();
        
        h1.nome = "Mário";
        h1.comer();
        h1.idade = 28;
        h1.fome = true;
        h1.comer();
        
        c1.nome = "floco";
        c1.comer();
        c1.idade = 10;
        c1.fome = true;
        c1.comer();
        
        p1.nome = "Loro";
        p1.comer();
        p1.idade = 25;
        p1.fome = true;
        p1.comer();
        
        g1.nome = "Lila";
        g1.comer();
        g1.idade = 12;
        g1.fome = true;
        g1.comer();

        
    }
    
}
