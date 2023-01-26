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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }
    
}
