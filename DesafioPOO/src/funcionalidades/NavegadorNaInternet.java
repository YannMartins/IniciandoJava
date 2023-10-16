package funcionalidades;

public interface NavegadorNaInternet {
    public default void exibirPagina() {
        System.out.println("Exibindo a página...");  
    }
    
    public default void adicionarNovaAba() {
       System.out.println("Adicionando nova aba...");
    }
    
    public default void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }
}