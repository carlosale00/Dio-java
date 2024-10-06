package src.edu.metodo;

// essa classe vai executar os métodos da classe SmartTv e mostar os valores no consele.

public class Usuario {
  public static void main(String [] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println(smartTv.getCanal());
    smartTv.setCanal(12);
    System.out.println(smartTv.getCanal());

    System.out.println(smartTv.getVolume());
    smartTv.setAumentarVolume();
    System.out.println(smartTv.getVolume());

    smartTv.setLigarTv();
    System.out.println(smartTv.getLigada());

    smartTv.setDesligarTv();
    System.out.println(smartTv.getLigada());

    smartTv.setCanal(4);
    System.out.println(smartTv.getCanal());

  }
  
}
