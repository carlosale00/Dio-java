package src.edu.java_dio.declaracao;
/**
 * MinhaClasse
 */
public class Pessoa {

    public static void main(String[] args) {
        // variável
        String nome = "Carlos";
        String sobrenome = "Silva";

        System.out.println(nomeCompleto(nome, sobrenome));

    }
     // método
    public static String nomeCompleto(String nome, String sobrenome){
        return nome.concat(" ").concat(sobrenome);
    }

}