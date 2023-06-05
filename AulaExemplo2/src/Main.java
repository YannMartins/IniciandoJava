public class Main {
    public static void main(String[] args) {
        var mercurio = new Planeta("Mercurio", 4878, 0.055);
        System.out.println(mercurio.nome);
    
        var terra = new Planeta("Terra", 12742, 1.0);
        System.out.println(terra.nome);
    
        var saturno = new Planeta("Saturno", 120536, 95.2);
        System.out.println(saturno.nome);
    }
}
