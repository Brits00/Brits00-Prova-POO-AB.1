public class LoginIcloud implements InterfaceLogin{
    private int id;

    //Construtor
    public LoginIcloud(int id) {
        this.id = id;
    }

    //Verificando se está logado na conta Icloud
    @Override
    public String logar() {
        String texto = " - LOGINICLOUD: id = " + id;

        if (id % 5 == 0)
            return "Logado no ICloud" + texto;

        return "Não está logado no ICLOUD" + texto;

    }

}