public class SistemaMedida {

    public static void main(String[] args) {

        String tamanho = "G";

        switch (tamanho) {
            case "P":{
                System.out.println("pequeno");
            }
            break;
            
            case "M":{
                System.out.println("Médio");
            }
            break;

            case "G":{
                System.out.println("Grande");
            }
            break;

            default:{
                System.out.println("tamanho invalido");
            }
                break;
        }
    }
}