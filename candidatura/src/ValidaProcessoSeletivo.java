import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ValidaProcessoSeletivo {

    static int salarioBase = 2000;
    static String[] candidatos = { "carlos", "marcos", "alisson", "maria",
            "jonas", "cesar", "nicolas", "sabrina", "neusa" };

    static String[] listaCandidados;
    static int candidatosSelecionados = 0;

    static void analisarCandidato(int salarioPretendido) {

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM A CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }

    /**
     * Método faz uma seleção de candidatos com base no valor de salario pretendido
     * 
     * @throws ArrayIndexOutOfBoundsException é uma exceção caso todos os candidatos
     *                                        da lista tenham passado pela seleção e
     *                                        nao tenha atingido minimo de
     *                                        candidatos.
     */

    static void selecionarCandidatos() {
        try {
            int candidatoAtual = 0;

            while (candidatosSelecionados < 5) {
                String candidato = candidatos[candidatoAtual];
                int salarioPretendido = valorPretendido();
                System.out.println("O candidato " + candidato + " solicitou este valor R$" + salarioPretendido);

                if (salarioBase > salarioPretendido) {
                    System.out.println("o candidato " + candidato + " foi selecionado para a entrevista");
                    candidatosSelecionados++;
                }
                candidatoAtual++;
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não temos mais candidatos, foram selecionados apenas " + candidatosSelecionados);
        }

    }

    /**
     * Este método é ultilizado para gerar valores aleatorios entre
     * 1800 e 2200.
     * 
     * @return um valor int entre 1800 e 2200
     */

    static int valorPretendido() {
        return ThreadLocalRandom.current().nextInt(1800, 2200);
    }

    /**
     * Método imprime o nome e o índice dos candidatos que estão em uma lista de
     * String.
     */

    static void imprimeListaCandidatos() {
        String[] listaCandidatos = { "carlos", "marcos", "alisson", "maria", "jonas" };
        System.out.println("Imprimindo a lista de candidatos selecionados");

        for (int i = 0; i < listaCandidatos.length; i++) {
            System.out.println("o candidato número " + (i + 1) + " é o " + listaCandidatos[i]);
        }
    }

    /**
     * Método gera números aleatorios entre 1 a 3 e compara se é igual a 1,
     * caso sim o retorno é true , e caso não o retorno será false.
     * 
     * @return true ou false
     */

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    /**
     * Método faz uma simulação de um tentativa de entrar em contato com o
     * candidato,
     * e imprime algumas mensagens no console para o usuário.
     * 
     * @param candidato nome do candidato.
     */

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            System.out.println("Entrando em contato com o candidato " + candidato);
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("contato realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);
        {
            if (atendeu) {
                System.out
                        .println("conseguimos contato com " + candidato + " em " + tentativasRealizadas + " tentivas");
            } else {
                System.out.println("nao conseguimos contato com " + candidato + " numero maximo de tentativas feita.");
            }
        }
    }
}