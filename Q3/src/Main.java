public class Main {
    public static void main(String[] args) throws Exception {

        //Instanciando o SingOn 
        InterfaceLogin meulogin = new SingOn("João", "12345678");

        //Instanciando o contrutor da Classe MeuLogin com o parametro do objeto meulogin
        MeuLogin meuapp = new MeuLogin(meulogin);
        meuapp.logarNoAPP(); //Chamando o método logar para o objeto meuapp

        //Instanciando o contrutor da Classe LoginGoogle
        InterfaceLogin loginGoogle = new LoginGoogle(2);
        meuapp.setLogin(loginGoogle); //Feito login com o google, porém pode ser setado outras formas de login
        meuapp.logarNoAPP();
    }
}
