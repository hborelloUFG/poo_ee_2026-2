package associacoes.cliente;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;

    // Construtor que inicializa os dados do objeto
    public Endereco(String rua, int numero, String bairro, String complemento, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters
    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Endereço: " + rua + ", " + numero + ", " + bairro + ", " + complemento + ", " + cidade + ", " + estado;
    }   

}
