package encapsulamento_atividade1;

import java.util.Random;
import java.util.Scanner;

public class Conta implements ControleConta {
    
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    
    private int num_conta;
    private String proprietario;
    private double balanco;

    private void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }
    
    public void abrirConta (){

        int num = rn.nextInt(99 - 00 + 1);
        this.setNum_conta(num);
        
        System.out.println("Digite o nome do proprietário:");
        this.proprietario = sc.nextLine();
        
        System.out.println("Deposito inicial? (s/n)");
        String resp = sc.next();
        if (resp.equals("s")){
            depositar();
        }
        status();
    }
    
    public void status(){
        System.out.println("----------------------------------");
        System.out.println("Numero da conta: " + this.num_conta);
        System.out.println("Proprietário: " + this.proprietario);
        System.out.println("Saldo: " + this.balanco);
    }

    @Override
    public void depositar(){
        System.out.println("Valor do depósito:");
        double deposito = sc.nextDouble();
        this.balanco += deposito;
    }
    
    @Override
    public void sacar(){
        System.out.println("Valor do saque:");
        double saque = sc.nextDouble();
        this.balanco -= (saque + 5);
    }
}
