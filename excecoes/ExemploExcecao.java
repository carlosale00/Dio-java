import java.util.Scanner;

public class ExemploExcecao {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome");
            String sobreNome = sc.next();

            System.out.println("Digite sua idade");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura");
            double altura = sc.nextDouble();

            // imprimindo os dados

            System.out.println("Ola, me chamo " + nome.toUpperCase() + nome + " " + sobreNome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("minha altura é 1" + altura + "cm ");
            sc.close();

        } catch (java.util.InputMismatchException e) {
            System.out.println("Campos idade e altura devem ser númericos");
        }

    }

}
