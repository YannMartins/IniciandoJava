package iphone;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone(); 
        System.out.println("Funções básicas disponiblizadas no Aparelho Telefônico: ");
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.atender();

        System.out.println("\nFunções referente ao Navegador na Internet: ");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        System.out.println("\nFunções referente ao Reprodutor Musical: ");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println(" ");
    }
}
