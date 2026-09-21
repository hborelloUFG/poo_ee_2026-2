package associacoes.empregado;

public class Empregado {

    // Atributos nome e matricula do empregado
    private String nome;
    private String matricula;

    private Empresa empresa;

    // Construtor que inicializa os dados do objeto
    public Empregado(String nome, String matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Empregado: " + nome + "\nMatrícula: " + matricula + "\nEmpresa: "
            + empresa.getRazao() + "\nCNPJ: " + empresa.getCnpj() + "\nEndereço: " 
            + empresa.getEndereco().toString(); 
    }

    
}
