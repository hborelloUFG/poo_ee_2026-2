package atividades.a05associacoes.musica;

public class Main {

    public static void main(String args[]) {
        // Criando os compositores
        Compositor c1 = new Compositor("Tom Jobim", "Brasileira");
        Compositor c2 = new Compositor("Vinicius de Moraes", "Brasileira");
        Compositor c3 = new Compositor("Paul McCartney", "Britânica");

        // Criando as músicas
        Musica m1 = new Musica("Garota de Ipanema", 1962, "Bossa Nova");
        Musica m2 = new Musica("Yesterday", 1965, "Rock");

        // Vinculando os compositores às músicas (conforme o diagrama)
        m1.adicionarCompositor(c1);
        m1.adicionarCompositor(c2);
        m1.adicionarCompositor(c3);

        m2.adicionarCompositor(c3);

        // Exibindo os objetos
        System.out.println(m1);
        System.out.println("\n-------------------\n");
        System.out.println(m2);
        
    }
}