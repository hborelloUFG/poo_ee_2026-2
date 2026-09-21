package atividades.a05associacoes.cliente;

public class Cliente {

    private String nome;
    private String cpf;

    private Endereco endereco;

    public Cliente(String nome, String cpf, String rua, int numero, String bairro,
                    String complemento, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, numero, bairro, complemento, cidade, 
                                    estado);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + "\nCPF: " + cpf + "\nEndereço:" + endereco.toString();
    }

}
