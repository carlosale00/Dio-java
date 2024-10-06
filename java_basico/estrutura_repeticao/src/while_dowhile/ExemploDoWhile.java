import java.util.Random;

public class ExemploDoWhile {

	public static void main(String[] args) {

		System.out.println("Discando...");

		do {
			System.out.println("Telefone tocando");
		} while (tocando());

		System.out.println("Alô !!!");
	}

	private static boolean tocando() {

		// gera numeros aleatorios entre 1 e 3 e faz um comparação de valores.
		// caso valor seja = 1 ele retorna verdadeiro caso o contrario falso.
		boolean atendeu = new Random().nextInt(3) == 1;
		System.out.println("atendeu: " + atendeu);

		// retorno é negado para que o while pare ou continue.
		// Ex: caso variavel atendeu seja verdadira o retorno sera falso para que o 
		// while termine e vice e versa.
		return !atendeu;
	}
}