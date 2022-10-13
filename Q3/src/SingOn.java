public class SingOn implements InterfaceLogin {
    private String usuario;
    private String senha;

    //Construtor
    public SingOn(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    //Verificando se está logado na conta SingOn
    @Override
    public String logar() {
        String texto = "LOGIN: " + this.usuario;

        if (usuario.length() + senha.length() == 12)
            return "USUARIO LOGADO " + texto;

        return "Não está logado" + texto;
    }

}