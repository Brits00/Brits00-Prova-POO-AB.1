package questao2;
import java.util.ArrayList;
public class Estacionamento {
    private ArrayList<questao2.Carro> carros = new ArrayList<>();

    public void adicionarCarro(questao2.Carro carro) {
        carros.add(carro);
    }
    int getQuantidadeDePessoasNoEstacionamento() {
        int totalPessoas = 0;
        for (questao2.Carro carro : carros) {
            totalPessoas += carro.getQuantidadePessoas();
        }
        return totalPessoas;
    }

    void listarCarrosNoEstacionamento() {
        for (questao2.Carro carro : carros) System.out.println(carro);
    }
}


