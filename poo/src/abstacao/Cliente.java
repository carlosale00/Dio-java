package abstacao;

public class Cliente {

    public static void main(String[] args) {
        // instânciando a classe 
        Facebook fc = new Facebook();
        // executando método da classe pai.
        fc.enviarMensagem();
        fc.receberMensagem();

        Instagram insta = new Instagram();
        insta.receberMensagem();
    }
    
}
