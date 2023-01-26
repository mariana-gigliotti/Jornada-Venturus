
package heranca_atividade2;

public class Papagaio extends Animal {

    @Override
    public void falar() {
        System.out.println("Oi!");
    }

    @Override
    public void comer() {
        if (fome == true){
            System.out.println("Comer quirelinha");
        }else {
            System.out.println("Não está com fome");
        }
    }
    
}
