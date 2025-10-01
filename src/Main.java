import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Métodos
        Scanner scanner = new Scanner(System.in);
        Cifra cifraDeCesar = new Cifra();

        // Entrada
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        int deslocamento = 3; // deslocamento padrao
        while (true) {
            System.out.print("Digite o deslocamento (0 - 25): ");
            deslocamento = scanner.nextInt();
            if (deslocamento > 25 || deslocamento < 0) {
                System.out.print("ERRO! Digite um deslocamento válido.");
            } else {
                break;
            }
        }

        scanner.nextLine();

        String acao;
        while (true){
            System.out.print("Ação (c: criptografar, d: descriptografar): ");
            acao = scanner.nextLine();
            if (!acao.equalsIgnoreCase("c") && !acao.equalsIgnoreCase("d")) {
                System.out.print("ERRO! Escolha uma ação válida.");
            } else {
                break;
            }
        }

        // Saída
        String resultado = cifraDeCesar.transformar(texto, deslocamento, acao);
        System.out.println("Resultado: " + resultado);
    }
}