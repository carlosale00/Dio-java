// Essa classe não pode ser instânciada

public abstract class Conta implements Iconta {

    // Atributos
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    // Constante com valor padrão para a agência.
    public static final int AGENCIA_PADRAO = 1;

    // Constante que será incrementada em sequência para cada instância criada.
    private static int SEQUENCIAL = 1;

    // Construtor da classe.
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
    // incrementando a constante
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Métodos da interface Iconta.
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        sacar(valor);
        destino.depositar(valor);
    }

    // Método getter dos atributos da classe.
    public void getAgencia() {
        System.out.println(agencia);
    }

    public void getNumero() {
        System.out.println(numero);
    }

    public void getSaldo() {
        System.out.println(saldo);
    }


    // Método que mostra algumas informações das contas
    protected void infoComum() {
        System.out.println(String.format("titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: R$%.2f", saldo));
    }
}
