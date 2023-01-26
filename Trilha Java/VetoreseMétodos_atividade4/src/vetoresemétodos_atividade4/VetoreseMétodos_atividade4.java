package vetoresemétodos_atividade4;

import java.util.Scanner;

public class VetoreseMétodos_atividade4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int matriz[][]= new int[3][3];
       
       for (int i=0; i < matriz.length; i++){
           for (int j=0; j < matriz.length; j++){
               System.out.printf("Digite o valor na posição: [%d][%d]%n", i,j);
               matriz[i][j] = sc.nextInt();
           }
        }
        
        System.out.println("Soma total: " + soma_total(matriz));
        System.out.println("Soma da linha 3: " + soma_3(matriz));
        System.out.println("Soma da coluna 2: " + soma_2(matriz));
        System.out.println("Soma da diagonal principal: " + soma_diagonal(matriz));
    }
    
    public static int soma_total (int [][] matriz){
        
        int soma = 0;
   
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                soma += matriz1[j];
            }
        }
        return soma;   
    }
    
    public static int soma_3 (int [][] matriz){
        
        int soma3 = 0;
   
        for (int i = 0; i < matriz.length; i++) {
                soma3 += matriz[2][i];
            }
        return soma3;   
    }
    
    public static int soma_2 (int [][] matriz){
        
        int soma2 = 0;
   
        for (int i = 0; i < matriz.length; i++) {
                soma2 += matriz[i][1];
            }
        return soma2;   
    }
    
    public static int soma_diagonal (int [][] matriz){
        
        int somad = 0;
   
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j){
                somad += matriz[i][j];
                }
            }
        }    
        return somad;
    }
    
}