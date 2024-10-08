package abstacao;

// classe filha herdando métodos da classe pai
public class Instagram extends ServiçoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Instagram");

    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Instagram");
    }
    
}
