package visibilidade_atividade2;

public class Visibilidade_Atividade2 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Azul", "Fusca", 1970, 140);
        
        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.pegarMarcha();
        
        
        System.out.println(c1.getMarcha());
        System.out.println(c1.getVelocidadeAtual());
    }
    
}
