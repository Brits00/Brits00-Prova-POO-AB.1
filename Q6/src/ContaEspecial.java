public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(){
        
    }

    public ContaEspecial(float limite,float saldo){
        this.limite = limite;
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(float valor){
        if (valor > (this.saldo + this.limite)) {
            return false;
        }
        else {
            return true;
        }
    }
    public String toString(){
        return  " tem saldo atual de " + this.saldo + " e o seu limite atual é de " + this.limite +
                ". Portanto ele consegue sacar até " + (this.saldo + this.limite) + 
                ", a operação é ";
        
    }
}
