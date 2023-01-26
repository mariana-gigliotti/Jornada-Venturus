package visibilidade_atividade2;

public class Carro {
    public String cor, marca, marcha;
    public int ano, velocidadeMaxima, velocidadeAtual;
    public boolean ligado;

    public Carro(String cor, String marca, int ano, int velocidadeMaxima) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.marcha = "Ponto Morto";
        this.ligado = false;
    }

    public String getMarcha() {
        return marcha;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void desligar(){
        ligado = false;
        System.out.println("Carro está desligado.");
    }
    
    public void ligar(){
        ligado = true;
        System.out.println("Carro está ligado;");
    }
    
    public void acelerar(){
        if (ligado == true){
            if (velocidadeAtual <= velocidadeMaxima){
                velocidadeAtual += 10;
            }else{
                System.out.println("Velocidade Máxima atingida!");
            }
        }else{
            System.out.println("Carro desligado!");
        }
    }
    
    public void pegarMarcha(){
        if (velocidadeAtual < 0){
            this.marcha = "ré";
        }else if (velocidadeAtual == 0){
            this.marcha = "Ponto Morto";
        }else if (velocidadeAtual < 40){
            this.marcha = "Media";
        }else if (velocidadeAtual <= 80){
            this.marcha = "Alta";
        }else{
            this.marcha = "3";
        }
    }
}
