import java.security.SecureRandom;

public class SecureEncryption {

    private final String chave;

    public SecureEncryption() {
        final SecureRandom random = new SecureRandom();
        final StringBuilder chaveBuilder = new StringBuilder();
        final int tamanhoChave = random.nextInt(51) + 50;

        for (int i = 0; i < tamanhoChave; i++) {
            char caractere = (char) (random.nextInt(26) + 'A');
            chaveBuilder.append(caractere);
        }

        this.chave = chaveBuilder.toString();
    }

    public String encriptarTexto(String minhaString) {
        final StringBuilder textoCriptografado = new StringBuilder();
        minhaString = minhaString.replaceAll(" ", "").toUpperCase();

        for (int i = 0; i < minhaString.length(); i++) {
            char caractere = minhaString.charAt(i);

            if (Character.isLetter(caractere)) {
                char novaLetra = (char) (((caractere + chave.charAt(i % chave.length())) % 26) + 'A');
                textoCriptografado.append(novaLetra);

            } else {
                textoCriptografado.append(caractere);
            }
        }

        return textoCriptografado.toString();
    }

    public String decriptarTexto(final String texto) {
        final StringBuilder textoDecriptado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            final char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                final char letraDecriptada = (char) (((caractere - chave.charAt(i % chave.length())) + 26) % 26 + 'A');
                textoDecriptado.append(letraDecriptada);

            } else {
                textoDecriptado.append(caractere);
            }
        }

        return textoDecriptado.toString();
    }
}
