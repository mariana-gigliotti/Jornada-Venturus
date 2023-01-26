package sequecial2_ativiade6;

import java.util.Scanner;

public class Sequecial2_ativiade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String resposta;
        
        System.out.println("Digite um valor:");
        double n = sc.nextDouble();
        
        resposta = (n < 5)? "Menor que 5":">5";
        
        if (resposta.equals(">5")) {
            resposta = (n >= 10)? "Maior que 10":"Maior que 5";
        }
        
        System.out.println(resposta);
       
    }
}
