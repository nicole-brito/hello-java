import java.util.Scanner;

public class somaFacil_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Soma Fácil ===");
        System.out.println("Digite o primeiro número (A): ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número (B): ");
        int b = scanner.nextInt();

        int res = a + b;

        System.out.println("\nO resultado é: " + res);


    }
}
