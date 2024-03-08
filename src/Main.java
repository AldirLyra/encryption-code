import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final Encriptacao encriptacao = new Encriptacao();
        final Decriptacao decriptacao = new Decriptacao();
        final Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase que deseja encriptar: ");
        String textoParaEncriptar = sc.nextLine();

        System.out.println("Este é o seu texto encriptado: ");
        System.out.println(encriptacao.encriptarTexto(textoParaEncriptar));

        System.out.println("Deseja realizar a decriptação ? ");
        System.out.println("(1) - SIM");
        System.out.println("(2) - NÃO");

        final Integer resposta = sc.nextInt();
        final String textoDecriptado = encriptacao.encriptarTexto(textoParaEncriptar);

        if(resposta == 1){
            System.out.println("Este é o seu texto decriptado: ");
            System.out.println(decriptacao.decriptarTexto(textoDecriptado));

        } else if (resposta == 2){
            System.out.println("Boa sorte para decriptar a mensagem...");
        }

    }
}