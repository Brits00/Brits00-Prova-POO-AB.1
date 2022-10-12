package questao2;
public class Carro {
    private String marca;
    private String cor;
    private int quantidadePessoas;

    private final int CAPACIDADE_PESSOAS = 5;

    public Carro(String marca, int quantidadePessoas, String cor) {
        this.marca = marca;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    @Override
    public String toString() {
        return String.format("\n Marca: %s Cor: %s  Quantidade de pessoas: %d", marca, cor, quantidadePessoas); }






}
