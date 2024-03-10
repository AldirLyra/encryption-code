import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final SecureEncryption secureEncryption = new SecureEncryption();

        final Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase que deseja criptografar:");
        final String frase = sc.nextLine();

        final String fraseCriptografada = secureEncryption.encriptarTexto(frase);
        System.out.println("Frase criptografada: " + fraseCriptografada);

        System.out.println("Deseja descriptografar a frase ?");
        System.out.println("(1) - SIM");
        System.out.println("(2) - NÃO");

        final Integer opcao = sc.nextInt();
        final String fraseDescriptografada = secureEncryption.decriptarTexto(fraseCriptografada);

        if (opcao == 1) {
            System.out.println("Frase descriptografada: " + fraseDescriptografada);

        } else if (opcao == 2) {
            System.out.println("Boa sorte para descriptografar a frase :)");
        }
    }
}