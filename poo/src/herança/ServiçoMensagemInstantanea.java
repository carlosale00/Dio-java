package herança;

// Classe pai com os métodos 
public class ServiçoMensagemInstantanea {
    public void enviarMensagem(){
        conectadoInternet();
        System.out.println("Enviando mensagem");
        salvandoHistorico();
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    public void conectadoInternet(){
        System.out.println("Conectado a internet");
    }

    public void salvandoHistorico(){
        System.out.println("Historico salvo");
    }
}
