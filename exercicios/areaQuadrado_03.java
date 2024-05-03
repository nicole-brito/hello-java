import java.util.Scanner;

public class areaQuadrado_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Área do Quadrado ===");
        System.out.println("Digite o valor: ");
        int l = scanner.nextInt();
        System.out.println("O valor da área do quadrado é: " + l * l);
    }
}
