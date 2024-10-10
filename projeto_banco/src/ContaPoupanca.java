public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extrato(){
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        infoComum();
    }
}
