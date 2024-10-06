public class ContaBanco {


    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    /**
   * @param numero Número da conta 4 digitos.
   * @param agencia Número da agencia no seguinte formato 000-0 
   * @param nomeCliente Nome do cliente da conta.
   * @param saldo Saldo da conta.
   * @return informações da conta.
   */

    public ContaBanco(int numero,String agencia, String nomeCliente, double saldo){

      this.numero = numero;
      this.agencia = agencia;
      this.nomeCliente = nomeCliente;
      this.saldo = saldo;
    }

    public int getNumero(){
      return this.numero;
    }

    public void setNumero(int valor){
      this.numero = valor;
    }
    
    public String getAgencia(){
      return this.agencia;
    }

    public void setAgencia(String valor){
      this.agencia = valor;
    }

    public String getNomeCliente(){
      return this.nomeCliente;
    }

    public void setNomeCliente(String valor){
      this.nomeCliente = valor;
    }

    public double getSaldo(){
      return this.saldo;
    }

    public void setSaldo( double valor){
      this.saldo = valor;
    }

    public String getConta(){
      return "Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() + " conta " + getNumero()+ " e seu saldo R$" + getSaldo() + " já esta disponivel para saque.";    }


    public static void main(String[] args) {
      ContaBanco cc = new ContaBanco(0,"0","carlos alexandre",1.1);
      
      System.out.println(cc.getSaldo());
      System.out.println(cc.getAgencia());
      System.out.println(cc.getNumero());
      System.out.println(cc.getNomeCliente());
      System.out.println(cc.getConta());

    }
}
