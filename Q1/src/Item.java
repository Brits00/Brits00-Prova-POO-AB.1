public class Item {
    private Produto produto;
    private int quantidade;

    public Item(){

    }

    public Item(Produto produto,int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    
    public double calcularValor(){
        return quantidade * produto.getValor();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Valor: " + produto.getValor() + "\n" +
                "Nome: " + produto.getNome() + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "TOTAL: " + calcularValor();
    }
}
