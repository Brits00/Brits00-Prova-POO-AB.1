public class Main {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente();
        ContaEspecial e = new ContaEspecial(0, 0);


        c.setNome("Thiago");
        e.setLimite(200);
        e.setSaldo(300);

        
        e.sacar(200);
        // Representando saque não disponivel.
        System.out.println(c.getNome() + e.toString() + e.sacar(600));
        
        // Representando saque disponivel.
        System.out.println(c.getNome() + e.toString() + e.sacar(400));
    
    }
}
