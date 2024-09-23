package condicionais.encadeado;

public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota = 5;
        
        if (nota < 6) {         
            System.out.println("Reprovado");
        }else if(nota == 6 ){
            System.out.println("Recuperação");
        }else 
            System.out.println("Aprovado");
    }
}