public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        if (args.length >= 2) {
            System.out.println("Configurando a JDK na versão " + args[0]);
            System.out.println("Programando em " + args[1]);
        } else {
            System.out.println("Por favor, passe dois argumentos: versão da JDK e linguagem.");
        }
    }
}
