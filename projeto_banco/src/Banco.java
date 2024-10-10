
public class Banco {

    public static void main(String[] args) {
        Cliente c1 = new Cliente(); 
        c1.setNome("Carlos");
        ContaCorrente cc = new ContaCorrente(c1);
        ContaPoupanca cp = new ContaPoupanca(c1);
        cc.depositar(500);
        cc.extrato();
        
        Cliente c2 = new Cliente(); 
        c2.setNome("Carlos");
        ContaCorrente cc2 = new ContaCorrente(c2);
        ContaPoupanca cp2 = new ContaPoupanca(c2);
        cc2.extrato();

        cc.transferir(250, cc2);

        cc.extrato();
        cc2.extrato();
    }
}