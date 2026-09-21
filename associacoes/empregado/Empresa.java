package associacoes.empregado;

import associacoes.cliente.Endereco;

public class Empresa {

    // Atributos razao e cnpj da empresa e objeto do tipo Endereco
    private String razao;
    private String cnpj;
    private Endereco endereco;

    // Construtor que inicializa os dados do objeto
    public Empresa(String razao, String cnpj, String rua, int numero, String bairro,
                    String complemento, String cidade, String estado) {
        this.razao = razao;
        this.cnpj = cnpj;
        this.endereco = new Endereco(rua, numero, bairro, complemento, cidade, 
            estado);
    }

    // Getters
    public String getRazao() {
        return razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Empresa: " + razao + "\nCNPJ: " + cnpj + "\nEndereço:" + endereco.toString();
    }   

}
