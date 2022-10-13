public class MeuLogin {
    private InterfaceLogin formalogin;

    //Construtor
    public MeuLogin(InterfaceLogin formalogin) {
        this.formalogin = formalogin;
    }

    public void setLogin(InterfaceLogin formalogin) {
        this.formalogin = formalogin;
    }

    //Verificando se está logado no APP
    public void logarNoAPP() {
        String token = formalogin.logar();

        System.out.println("\n");
        if (isLogado(token)) {
            System.out.println("Estou logado na minha conta = " + token);
            return;
        }

        System.out.println("<" + token + ">");
    }

    //Verificar se a variavel token é True ou False
    private boolean isLogado(String token) {
        return token.startsWith("0000");
    }

}

