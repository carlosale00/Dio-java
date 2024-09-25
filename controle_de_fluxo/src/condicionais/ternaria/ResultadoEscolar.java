public class ResultadoEscolar {

    // Condição ternaria é um modo de abreviar o algorítmo condicional 

    public static void main(String[] args) {
        int nota = 7;
        
        String resultado = nota < 6 ? "reprovado" : nota == 6 ? "recuperação" : "aprovado";

        System.out.println(resultado);
    }
}
