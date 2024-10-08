package abstacao;

// classe filha herdando métodos da classe pai
public class Facebook extends ServiçoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }


}