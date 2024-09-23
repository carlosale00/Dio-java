package src.edu.terminal;

/* exemplo de programa que tem iteração do usuário 
* vamos usar uma classe para gerar essa iteraçao do usuário com o programa
* usaremos a classe scaner 
*/

import java.util.Locale;
import java.util.Scanner;

public class MeuPrograma {

  public static void main(String[] args) {
    
    // criando objeto scaner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digit your firstname");
    String firstName = scanner.next();
    System.out.println("Digit your lastname");
    String lastName = scanner.next();
    System.out.println("hello " + firstName + " " + lastName );
  }
}
  