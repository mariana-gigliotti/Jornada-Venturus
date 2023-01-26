package objetoseclasse_atividade1;

class Triangulo {
    double ladoA, ladoB, ladoC;
    String nome;
    
    double calcularArea(){
        double semiper = (this.ladoA+this.ladoB+this.ladoC) / 2;
        double area = Math.sqrt(semiper*(semiper-this.ladoA)*
                (semiper-this.ladoB)*(semiper-this.ladoC));
        return area;
    }
    
    void compararArea(Triangulo t){
        double area1 = calcularArea();
        double area2 = t.calcularArea();
        if (area1 > area2){
            System.out.println("A área do triangulo " + this.nome +
                    " é maior que do triângulo " + t.nome + "." );
        } else{
            System.out.println("A área do triangulo " + t.nome +
                    " é maior que do triângulo " + this.nome + "." );
        }
    }
}
