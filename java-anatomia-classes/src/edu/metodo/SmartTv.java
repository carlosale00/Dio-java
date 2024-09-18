// Exercitando
// Vamos criar uma classe para representar uma SmartTv onde:
// 1. Ela tenha as características : boolean:ligada, int:canal. int:volume.
// 2. Nossa tv poderá ligar e desligar e assim mudar o estado de ligada.
// 3. Nossa tv almentará o volume sempre em +1 ou -1.
// 4. Nossa tv poderá mudar de canal de 1 em 1 ou definido pelo usuário.

package edu.metodo;

public class SmartTv {


  private boolean ligada = false;
  private int canal = 4;
  private int volume = 25;

  // Método que muda o estado para ligado.
  public void setLigarTv(){ 
    ligada = true;
  }

  // Método que muda o estado para desligado.
  public void setDesligarTv(){
    ligada = false;
  }

  // Método que retorna o status para o usuário.
  public String getLigada(){

    String status;
    if (ligada == true){
      status = "Smart Tv ligada";}
    else{
      status = "Smart Tv desligada";
    }
    return status;
  }

  // Método que aumenta o volume.
  public void setAumentarVolume(){
    ++volume;
  }

  // Método que diminui o volume.
  public void setDiminuirVolume(){
    --volume;
  }

  // Método que mostra ao usuario o volume atual.
  public int getVolume(){
    return volume;
  }

  // Método que mostra ao usuario o canal atual.
  public int getCanal(){
    return canal;
  }

  // Método que o usuario pode alterar o canal por uma valar.
  public void setCanal(int valor){
    canal = valor;
  }
}
