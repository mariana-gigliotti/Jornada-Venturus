package heranca_atividade2;

public class Homem extends Animal{

    @Override
    public void falar() {
        System.out.println("Oi!");
    }

    @Override
    public void comer() {
        if (fome == true){
            System.out.println("Tomar café!");
        }else {
            System.out.println("Não está com fome");
        }
    }
    
}
