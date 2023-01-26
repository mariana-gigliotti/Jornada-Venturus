package heranca_atividade2;

public class Gato extends Animal{

    @Override
    public void falar() {
        System.out.println("Miau!");
    }

    @Override
    public void comer() {
        if (fome == true){
            System.out.println("Comer peixe");
        }else {
            System.out.println("Não está com fome");
        }    
    }
    
}
