package excecoes_customizadas;

public class FormatarCepExemplo {

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8)
            throw new CepInvalidException();

        // simulando um cep formatado
        return "23.765-064";
    }

    public static void main(String[] args) {

        String cep1;

        try {
            cep1 = formatarCep("833265800");
            System.out.println(cep1);

        } catch (CepInvalidException e) {
            System.out.println("Formato fora do padrão, não corresponde a regra de apenas 8 digitos");
        }
    }
}
