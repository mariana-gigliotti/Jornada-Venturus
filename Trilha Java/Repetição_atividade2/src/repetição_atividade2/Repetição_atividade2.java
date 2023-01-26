package repetição_atividade2;

import java.util.Scanner;

public class Repetição_atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha;
        boolean n = true;
        
        do {
            System.out.println("Digite a senha numérica de 4 digitos:");
            senha = sc.nextInt();
            
            if (senha == 2023){
                System.out.println("Acesso Permitido!");
                n = false;
            }else{
                System.out.println("Senha inválida!");
                System.out.println("Tente novamente.");        
            }
        }while (n == true);
    }
    
}
