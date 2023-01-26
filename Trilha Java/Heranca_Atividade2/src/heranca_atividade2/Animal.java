package heranca_atividade2;

public abstract class Animal {
    public String nome;
    public int idade;
    public boolean fome;

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
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
    
    public abstract void falar();
    public abstract void comer();
}
