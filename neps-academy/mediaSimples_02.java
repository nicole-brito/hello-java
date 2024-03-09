import java.util.Scanner;

public class mediaSimples_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Média Simples ===");
        System.out.println("Digite o primeiro número (A): ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número (B): ");
        int b = scanner.nextInt();

        System.out.println("\nO resultado é: " + (a + b) /2);
    }
}
