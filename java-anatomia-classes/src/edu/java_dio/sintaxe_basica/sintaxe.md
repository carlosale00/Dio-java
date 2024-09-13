# Anatomia de classes

A escrita de códigos de um programa é feita através da compposição de palavras pr-definidas pela linguagem com as expressões que ultilizamos
para determinar o nome dos nossos arquivos , classes, atributos e métodos.

É muito comum mesclarmos expresões no idioma inglês americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja na escrita na língua inglesa.

### sintaxe de declaração
```java
public class MinhaClass {
  // corpo da classe
}
```

toda classe que precisa ser inicializada, ela necessita de um método
especial denominado __main__

### sintaxe de declaração
```java
public class MinhaClass {
  // corpo da classe

  // método inicialização, que vai imprimir apenas uma mensagem no console.
  public static void main(String [] args){
    system.out.printIn("ola, seja bem vindo");
  }
}
```