import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    /* TODO: Conhecer e importar a classe  Scanner.
     * 
     * Exibir as mensagens para o nosso usuário.
     * 
     * Obter pela Scanner os valores no terminal.
     * 
     * executar a o métdo conta com a mensagem 
     * 
    */

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o número da agência: ");
    String agencia = sc.next();
    System.out.println("Digite o número da conta: ");
    int numero = sc.nextInt();
    System.out.println("Digite seu nome: ");
    String nome = sc.next();
    System.out.println("Digite seu saldo: ");
    double saldo = sc.nextDouble();

    ContaBanco cc = new ContaBanco(numero, agencia, nome, saldo);

    System.out.println(cc.getConta());
  }
  
}