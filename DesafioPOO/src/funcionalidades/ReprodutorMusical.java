package funcionalidades;

public interface ReprodutorMusical {
    public default void selecionarMusica() {
    System.out.println("Música selecionada de acordo.");
    }

    public default void tocar() {
        System.out.println("Tocando a música selecionada...");
    }
    
    public default void pausar() {
        System.out.println("Pausando a música atual...");
    }
}