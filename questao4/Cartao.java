package questao4;
public class Cartao extends questao4.MeioPagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento autorizado no cartão de crédito");
    }


}
