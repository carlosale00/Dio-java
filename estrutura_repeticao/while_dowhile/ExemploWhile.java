import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {

    // retorna valores aleatorios entre 2 e 8
    public static int valorAleatorio(){
        return ThreadLocalRandom.current().nextInt(2,8);
    }

    
    public static void main(String[] args) {

        int mesada = 50;

        while (mesada > 0){
            int valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                System.out.println("sua mesada é : " + mesada); 
                break;                              
            }
            System.out.println("Doce de valor : " + valorDoce + " foi adicionado");
            mesada -= valorDoce;           
        }
    }

}
