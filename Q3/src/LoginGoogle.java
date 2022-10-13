public class LoginGoogle implements InterfaceLogin {
    private int id;

    //Construtor
    public LoginGoogle(int id) {
        this.id = id;
    }

    //Verificando se está logado na conta Google
    @Override
    public String logar() {
        String texto = " - LOGINGOOGLE: id = " + id;

        if (id % 2 == 0)
            return "Logado no GOOGLE" + texto;

        return "Não está logado no GOOGLE" + texto;

    }

}

