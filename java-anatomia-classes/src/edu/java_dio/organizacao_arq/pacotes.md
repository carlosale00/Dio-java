# Organização de arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (códigos fonte)<br>
em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma <br>
organização destes aqrquivos através de pacotes (PACKGES).

existe uma convençao para organização desses pacotes, que ficam da seguinte forma: 

* Vai conter a diretorio com o tipo de projeto abreviado.

1. organizacional - org
2. educacional - edu
3. comercial - com
4. opensource - opensource 

* Nome da empresa 

* Tipo de funcionalidade

## ficar da seguinte forma 

```java
// extrutura do diretorio em pacote (packges)
edu
--- marcos
--------- aula_primeira_semama
------------------MinhaClasse.java
--------- aulas_segunda_semana
```

```java
// usando o pacote do arquivo que não esta na raiz do projeto 

packge edu.marcos.aula_primeira_semana;

Public class MinhaClasse{
  
}
```