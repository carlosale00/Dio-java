public class ExemploBreakContinue {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                // break; // interrompe o programa caso seja verdadeiro
                continue; // pula apenas o valor que é verdadeiro e continua a execução
            }

            System.out.println(i);

        }
    }
}

