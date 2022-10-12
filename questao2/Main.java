package questao2;
public class Main {
    public static void main(String[] args) {
        questao2.Estacionamento estacionamento = new questao2.Estacionamento();
        estacionamento.adicionarCarro(new questao2.Carro("Toyota hilux",3, "preto"));
        estacionamento.adicionarCarro(new questao2.Carro("Chevrolet Onix", 4,"branco"));
        estacionamento.adicionarCarro(new questao2.Carro("Volkswagen Gol", 2, "prata"));
        estacionamento.listarCarrosNoEstacionamento();
    }

}