import java.util.Scanner;

import static java.lang.Integer.*;

public class fliper_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Fliper ===");
        System.out.println("Digite as duas posições das portas do fliper (0 - esq ou 1 - dir): ");

        String entrada = scanner.nextLine();

        String[] posicoes = entrada.split(" ");

        if (posicoes.length != 2) {
            System.out.println("Entrada inválida! Devem ser fornecidas duas posições ('0 0'");
            return;
        }

        int p = Integer.parseInt(posicoes[0]);
        int r = Integer.parseInt(posicoes[1]);


        if (p + r == 0) {
            System.out.println("Resultado: Porta A");
        } else if (p + r == 1) {
            System.out.println("Resultado: Porta B");
        }
        if (p + r == 2) {
            System.out.println("Resultado: Porta C");
        }


    }
}