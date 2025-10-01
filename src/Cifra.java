public class Cifra {
    public String transformar(String texto, int deslocamento, String acao) {
        StringBuilder resultado = new StringBuilder();
        for (char caractere : texto.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base;
                if (Character.isLowerCase(caractere)) {
                    base = 'a';
                } else {
                    base = 'A';
                }
                char novo_caractere;
                if (acao.equalsIgnoreCase("c")) {
                    novo_caractere = (char) ((caractere - base + deslocamento) % 26 + base);
                } else {
                    novo_caractere = (char) ((caractere - base - deslocamento) % 26 + base);
                }

                resultado.append(novo_caractere);
            } else {
                resultado.append(caractere);
            }
        }
        return resultado.toString();
    }
}
