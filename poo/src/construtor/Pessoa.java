package construtor;
public class Pessoa {

    // Variáveis privadas acessadas apenas pela propria classe.
    private String nome;
    private String cpf;
    private String endereco;

    // Método contrutor da classe , recebe paramêtros obrigatorios na instância.
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // Encapsulando em métodos, porque as varíaveis não podem ser acessadas diretamente
    // pois são privadas.
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
