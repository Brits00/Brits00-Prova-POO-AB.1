package questao5;
public abstract class UFALBluetooth {
    public void iniciarConexao() {
        System.out.println("Iniciando a conexão");
    }
    public abstract void processarDados();

    public void encerrarConexao() {
        System.out.println("Encerrando a conexão");
    }

}
