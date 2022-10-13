package questao4;
public class Main {
    public static void main(String[] args) {
            questao4.Pix pix = new questao4.Pix();
            pix.pagar();

            questao4.Cartao cartao = new questao4.Cartao();
            cartao.pagar();

            questao4.Boleto boleto = new questao4.Boleto();
            boleto.pagar();
    }
}