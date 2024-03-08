public class Encriptacao {

    public String encriptarTexto(String minhaString) {
        final StringBuilder textoEncriptado = new StringBuilder();

        for (int i = 0; i < minhaString.length(); i++) {
            final char caractere = minhaString.charAt(i);

            if (Character.isLetter(caractere)) {
                int valorNumerico = (Character.toLowerCase(caractere) - 'a' + 1) + 3;
                if (valorNumerico > 26) {
                    valorNumerico -= 26;
                }
                System.out.println(valorNumerico);
                textoEncriptado.append(valorNumerico * 2);
            } else {
                textoEncriptado.append(caractere);
            }
        }

        return textoEncriptado.toString();
    }


    public String encriptarTextoTeste(String minhaString) {
        final StringBuilder novaString = new StringBuilder();
        minhaString = minhaString.replaceAll(" ", "");

        for (int i = 0; i < minhaString.length(); i++) {
            final char caractere = Character.toLowerCase(minhaString.charAt(i));

            if (Character.isLetter(caractere)) {
                char novaLetra = (char) (caractere + 3);

                if (novaLetra > 'z') {
                    novaLetra = (char) (caractere - (26 - 3));
                }

                novaString.append(novaLetra);

            } else {
                novaString.append(caractere);
            }
        }

        return novaString.toString();
    }
}
