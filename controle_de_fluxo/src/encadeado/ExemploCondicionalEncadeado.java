public class ExemploCondicionalEncadeado {

    public static void main(String[] args) {
        int nota = 6;
        
        if (nota < 6) {         
            System.out.println("Reprovado");
        }else if(nota == 6 ){
            System.out.println("Recuperação");
        }else 
            System.out.println("Aprovado");
    }
}