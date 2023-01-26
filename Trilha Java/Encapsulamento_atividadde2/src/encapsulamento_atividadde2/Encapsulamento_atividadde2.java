package encapsulamento_atividadde2;

public class Encapsulamento_atividadde2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.Cadastrar();
        p1.end = new Endereco();
        p1.end.rua = "Candura";
        p1.end.bairro = "Taquaral";
        p1.end.cidade = "São Paulo";
        p1.end.numero = 123;
        p1.end.estado = "SP";
        p1.apresentar();         
    }
    
}
