import java.util.ArrayList;

public class Compras {
    private final ArrayList <Item> itens = new ArrayList<>();

    //Iterando sobre os elementos do Array
    @Override
    public String toString() {
        String listaString = "";
        for (Item i : itens) {
            listaString = listaString + i.toString() + "\n\n";
        }
        return listaString;
    }

    //Adicionando elementos no Array
    public void adicionar(Item item){
        itens.add(item);
    }

    //Calculando o total das compras
    public double totalCompra(){
        double calc = 0;
        for (Item j : itens) {
            calc = calc + j.calcularValor();
        }
        return calc;
    }
}
