public class Decriptacao {

    public String decriptarTexto(String texto) {
        final StringBuilder textoDecriptado = new StringBuilder();
        int index = 0;

        while (index < texto.length()) {
            char caractere = texto.charAt(index);

            if (Character.isDigit(caractere)) {
                int valorNumerico = Character.getNumericValue(caractere);
                int valorOriginal = (((valorNumerico / 2) - 3) % 26) + 1;
                if (valorOriginal <= 0) {
                    valorOriginal += 26;
                }
                textoDecriptado.append((char) (valorOriginal + 'a' - 1));
                index++;
            } else {
                textoDecriptado.append(caractere);
                index++;
            }
        }

        return textoDecriptado.toString();
    }

    public String decriptarTextoTeste(String texto) {
        final StringBuilder textoDecriptado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            final char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char letraDecriptada = (char) (caractere - 3);

                if ((Character.isLowerCase(caractere) && letraDecriptada < 'a') || (Character.isUpperCase(caractere) && letraDecriptada < 'A')) {
                    letraDecriptada = (char) (caractere + (26 - 3));
                }

                textoDecriptado.append(letraDecriptada);

            } else {
                textoDecriptado.append(caractere);
            }
        }

        return textoDecriptado.toString();
    }
}
