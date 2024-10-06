# Identação

é um termo ultilizado para escrever o código do programama de forma hierárquica,<br>
facilitando assim a visualização eo entendimento do programa.<br>
Na linguagem Java não é necessario , mais e uma boa pratica.<br>

## ex:
```java
// código sem identação
public class BoletinEscolar{

public static void main(String [] args){

int mediaFinal = 5;
if (mediaFinal < 6)
System.out.println("Reprovado");
else if (mediaFinal == 6)
System.out.println("Recuperação");
else 
System.out.println("Aprovado");
}
}
```


```java
// código identado
public class BoletinEscolar{

  public static void main(String [] args){

    int mediaFinal = 5;
    if (mediaFinal < 6)
      System.out.println("Reprovado");
    else if (mediaFinal == 6)
      System.out.println("Recuperação");
    else 
      System.out.println("Aprovado");
  }
}
```
<p>Ambos os codigos funcionam em java, mais o código identado fica mais facila a sua<br>
visulização e compreenção.