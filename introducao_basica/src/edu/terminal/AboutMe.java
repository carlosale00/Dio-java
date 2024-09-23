package src.edu.terminal;

/* 
<h1> Iteração no terminal </h1>
exemplo de programa que tem iteração do usuário 

* no terminal deve se estar na pasta bin , onde contem o arquivo compilado 
* usar o comando java AboutMe 1ºparam 2ºparam.
* EX: java AboutMe Carlos Alexandre
* que seram executados de forma dinamica no terminal.

*/

public class AboutMe {
  public static void main(String[] args) {
    String nome = args[0];
    String sobrenome = args[1];
    System.out.println("Meu nome é " + nome + " " + sobrenome );
  }
}
  