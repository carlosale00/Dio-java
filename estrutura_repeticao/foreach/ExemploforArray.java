public class ExemploforArray {
  
  public static void main(String[] args) {

    String alunos [] = {"carlos", "andre", "maycon", "cesar"};

    for(int i = 0 ; i <= alunos.length ; i++){
      System.out.println("aluno " + i + " é " + alunos[i]);
    }
  }
}

class ExemploForEach{ 

  public static void main(String[] args) {
    String alunos [] = {"carlos", "andre", "maycon", "cesar"};

    for(String i : alunos){
      System.out.println("Nome do aluno é " + i);
    }
  }

}
