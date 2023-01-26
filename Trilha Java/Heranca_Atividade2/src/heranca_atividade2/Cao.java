package heranca_atividade2;

public class Cao extends Animal{

    @Override
    public void falar() {
        System.out.println("Au au!");
    }

    @Override
    public void comer() {
        if (fome == true){
            System.out.println("Comer Bife");
        }else {
            System.out.println("Não está com fome");
        }
    }
    
}
