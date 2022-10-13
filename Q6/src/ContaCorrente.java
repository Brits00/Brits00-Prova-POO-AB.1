public abstract class ContaCorrente {
    protected float saldo;

    
    public ContaCorrente(){
    }
    
    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor){

    }
//a
    public boolean sacar(float saldo){
        if (saldo > 0){
            if (this.saldo > saldo) {
                return false;
            }
            else {
                return true;
            }
        }else{
            return false;
        }
    }

    public String toString(){
        return null;

    }

    public boolean transferir(ContaCorrente contaCorrente){
        if (this.saldo < saldo) {
            return false;
        }
        else {
            return true;
        }
    }
    
}
