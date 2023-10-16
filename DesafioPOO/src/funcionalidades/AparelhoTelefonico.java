package funcionalidades;

public interface AparelhoTelefonico {
    public default void ligar(){
        System.out.println("Ligando o aparelho...");
    }

    public default void atender() {
        System.out.println("Atender ligação?");
    }

    public default void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}