public class LoginFacebook implements InterfaceLogin{
    private int id;

    //Construtor
    public LoginFacebook(int id) {
        this.id = id;
    }

    //Verificando se está logado na conta Facebook
    @Override
    public String logar() {
        String texto = " - LOGINFACEBOOK: id = " + id;

        if (id % 3 == 0)
            return "Logado no Facebook" + texto;

        return "Não está logado no FACEBOOK" + texto;

    }

}