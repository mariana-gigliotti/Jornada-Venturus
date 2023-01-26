package condicional_atividade13;

import java.util.Scanner;

public class Condicional_atividade13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do salário:");
        double salario = sc.nextDouble();
        double imposto;
        
        if (salario <= 1903.98){
            System.out.println("Salário insento de IR");
            imposto = 0;
        }else if (salario <= 2826.65){
            imposto = salario * 0.075;
        }else if (salario <= 3751.05){
            imposto = salario * 0.15;
        }else if (salario <= 4664.68){
            imposto = salario * 0.225;
        } else{
            imposto = salario * 0.275;
        }
       
        System.out.printf("O Imposto de renda terá o valor de %.2f%n", imposto);
        sc.close();
    }
}
