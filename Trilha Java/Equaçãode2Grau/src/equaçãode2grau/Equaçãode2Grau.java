package equaçãode2grau;

import java.util.Scanner;

public class Equaçãode2Grau {

    public static void main(String[] args) {
        
        double a, b, c;
        double delta, raiz, raiz2;
        
        System.out.println("Resolvendo equações de Segundo Grau!");
        System.out.println("Ax²+Bx+C = 0");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B:"); 
        b = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        c = sc.nextDouble();
        
        delta = (b*b)-(4*a*c);
        
        System.out.println(delta);
        
        if (delta >= 0){
            if (delta == 0){
                raiz = (-b+Math.sqrt(delta)) /(2*a);
                System.out.println("A equação possui apenas uma raiz real");
                System.out.println("Raiz = " + raiz);
            }
            else {
                raiz = (-b+Math.sqrt(delta)) /(2*a);
                raiz2 =(-b-Math.sqrt(delta)) /(2*a);
                System.out.println("A equação possui duas raizes reais");
                System.out.println("Primeira raiz = " + raiz);
                System.out.println("Segunda raiz = " + raiz2);
            } 
        }
        else {
            System.out.println("A equação não possui raiz real");
        }
   
        
        
    }
    
}
