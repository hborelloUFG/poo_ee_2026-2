package associacoes.empregado;

public class Main {
    public static void main(String[] args) {
        // Criando um empregado associado à empresa
        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-90", 
            "Rua A", 123, "Bairro B", "Apto 101", "Goiania", "Goiás");
        Empregado empregado = new Empregado("João Silva",
             "12345", empresa);

            Empregado empregado2 = new Empregado("Maria Silva",
             "09876", empresa);

        // Exibindo informações do empregado e da empresa
        System.out.println(empregado);
        System.out.println(empregado2);
    }
}
