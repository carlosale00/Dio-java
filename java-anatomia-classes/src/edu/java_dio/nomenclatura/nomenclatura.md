# Nomenclatura 

## Padrão de nomenclatura

Quando se trata de escrever códigos na linguagemm __Java__, é recomendado <br>
seguir algumas convenções de escrita. Esses padrôes estão expressos nos itens <br>
abaixo.

* __Arquivo_java__: Todo arquivo __,java__ deve começar com letra MAIÚSCULA.<br>
Se a palavra for composta, a segunda palavra deve também ser maiúscula.
<br>EXEMPLO:
<br>Calculadora.java, CalculadoraCientifica.java

* __Nome da classe no arqivo__: A classe deve possuir o mesmo nome do arquivo <br>
.java, EXEMPLO: <br>

```java
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica{
}
```

* __Nome de variáveis__: Toda variável deve ser escrita com letra minúscula<br>
porém se a palavra for composta, a segunda palavra deve começar com a letra <br>
maiúscula, no padrão __camelCase__.<br>
EXEMPLO:<br>
ano<br>
anoFabricaçao<br>

Existe uma regra para identificar uma constante , que náo altera o seu valor<br>
é usada a palavra reservada __final__ e deve ser toda em maiúsculo.<br>
EXEMPLO: <br>

```java
public class CalculadoraCientifica{

  // valor de BR nao podera ser alterado
  
  final String BR = "Brasil";
}
```

* Para declarar uma variável podemos ultiizar caracteres, números e símbolos,<br>
mas devemos seguir algumas regras.<br>

* Devem comnter apenas letras, _(underline), $ ou numeros.
* Devem obrigatoriamente iniciar com uma letra, _(underline) ou $ e jamais com <br>
números.
* Não deve conter espaços.
* Não pode usar palavras reservadas da linguagem.
* O nome deve ser único no escopo.<br>

```java
// declaração invalidas.

int numero&um = 1; // únicos carâcteres permitidos são $ e _ 
int 1numero = 1; // não pode começar com número.
int numero um = 1; // não deve conter espaços.
int long = 1; // long é uma palavra reservada da linguagem.

// declaração validas
int numero_um = 1;
int numero1 = 1;
int numeroUm = 1;
int longo = 1;
```