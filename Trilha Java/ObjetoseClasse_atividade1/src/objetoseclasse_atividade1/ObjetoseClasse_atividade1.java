package objetoseclasse_atividade1;

public class ObjetoseClasse_atividade1 {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        
        t1.ladoA = 3;
        t1.ladoB = 4;
        t1.ladoC = 5;
        t1.nome = "A";
        
        Triangulo t2 = new Triangulo();
        
        t2.ladoA = 6;
        t2.ladoB = 8;
        t2.ladoC = 10;
        t2.nome = "B";
        
        System.out.println("As áreas são:");
        System.out.println("Área " + t1.nome + " = " + t1.calcularArea());
        System.out.println("Área " + t2.nome + " = " + t2.calcularArea());
        
        t1.compararArea(t2);
    }
    
}
