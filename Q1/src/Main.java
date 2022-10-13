public class Main {
    public static void main(String[] args) throws Exception {

        //Instanciando os produtos
        Produto arroz = new Produto("Arroz", 5);
        Produto feijao = new Produto("Feijão", 6);

        //Instanciando as Compras e os itens adicionados para comprars.
        Compras a = new Compras();
        Item b = new Item(feijao, 2);
        Item c = new Item(arroz, 1);

        //Adicionando itens e calculando o total.
        a.adicionar(b);
        a.adicionar(c);
        System.out.println(a);
        System.out.println("TOTAL: " + a.totalCompra());

    
    }
}