package associacoes.cliente;

public class Main {

    public static void main(String[] args) {
        // Criando um cliente com endereço
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "Rua A", 123, "Bairro B", "Apto 101", "Goiania", "Goias");

        // Exibindo informações do cliente e seu endereço
        System.out.println(cliente.toString());
    }

}
 