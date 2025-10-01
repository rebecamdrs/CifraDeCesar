import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Métodos
        Scanner scanner = new Scanner(System.in);
        Cifra cifraDeCesar = new Cifra();

        // Entrada
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite o deslocamento (0 - 25): ");
        int deslocamento = scanner.nextInt();
        scanner.nextLine();

        String acao;
        while (true){
            System.out.print("Ação (c: criptografar, d: descriptografar): ");
            acao = scanner.nextLine();
            if (!acao.equalsIgnoreCase("c") && !acao.equalsIgnoreCase("d")) {
                System.out.print("ERRO! Escolha uma ação válida!");
            } else {
                break;
            }
        }

        // Saída
        String resultado = cifraDeCesar.transformar(texto, deslocamento, acao);
        System.out.println("Resultado: " + resultado);
    }
}