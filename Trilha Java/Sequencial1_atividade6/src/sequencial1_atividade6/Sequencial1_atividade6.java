package sequencial1_atividade6;

import java.util.Scanner;

public class Sequencial1_atividade6 {

    public static void main(String[] args) {
        
        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores");
        System.out.println("Primeiro valores:");
        a = sc.nextDouble();
        System.out.println("Segundo valores:");
        b = sc.nextDouble();
        System.out.println("Terceiro valores:");
        c = sc.nextDouble();
        
        areaTriangulo = (a*c) / 2;
        areaCirculo = Math.PI*Math.pow(c,2);
        areaTrapezio = (a+b)*(c/2);
        areaQuadrado = b*b;
        areaRetangulo = a*b;
        
        System.out.printf("Área do triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Área do círculo: %.3f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.3f%n", areaRetangulo);
    
    }
    
}
