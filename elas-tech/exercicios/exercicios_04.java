package exercicios;

import java.util.Scanner;

public class exercicios_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Atividade 1
        System.out.println("=== Atividade 1 ===");
        System.out.println("\nOlá :) Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Agora digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Bem vind@, " + nome + "! Você tem " + idade + " anos.");

        //Atividade 2
        System.out.println("\n=== Atividade 2 ===");
        System.out.println("Insira um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Insira outro número: ");
        int n2 = scanner.nextInt();
        System.out.println("\nA soma de " + n1 + "+" + n2 + " é: " + (n1 + n2));
        System.out.println("A subtração de " + n1 + "-" + n2 + " é: " + (n1 - Math.abs(n2)));
        System.out.println("A subtração de " + n1 + "-" + n2 + " é: " + (n1 - n2));
        System.out.println("A multiplicação de " + n1 + "*" + n2 + " é: " + (n1 * n2));
        System.out.println("A divisão de " + n1 + "/" + n2 + " é: " + (n1 / n2));

        //Atividade 3
        System.out.println("\n=== Atividade 3 ===");
        System.out.println("Digite um número para verificar se é positivo ou negativo: ");
        int num = scanner.nextInt();

        if (num > 1) {
            System.out.println("O número é positivo");
        } else if (num == 0) {
            System.out.println("O número é zero");
        } else {
            System.out.println("O número é negativo");
        }

        //Atividade 4
        System.out.println("\n=== Atividade 4 ===");
        System.out.println("Digite um número de 1 a 7 para saber qual o dia da semana correspondente: ");
        int sem = scanner.nextInt();

        switch (sem) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Esse não é um número válido :(");
        }

        //Atividade 5
        System.out.println("\n=== Atividade 5 ===");
        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        if (number > 1) {
            System.out.println("O número " + number + " é positivo");
        } else if (number == 0) {
            System.out.println("O número " + number + " é zero");
        } else {
            System.out.println("O número " + Math.abs(number) + " é negativo");
        }


        switch (number % 2) {
            case 0:
                System.out.println("O número " + number + " é par");
                break;
            case 1:
                System.out.println("O número " + number + " é ímpar");
                break;
            default:
                System.out.println("Isso não é um número!");
        }

        //Atividade 6
        System.out.println("\n=== Atividade 6 ===");
        System.out.println("Insira o valor total da sua compra: ");
        double valor = scanner.nextFloat();

        if (valor >= 200) {
            System.out.println("Desconto de " + (valor * 0.1) + " aplicado!\nValor atualizado: " + (valor * 0.9));
        } else if (valor > 100 && valor < 200) {
            System.out.println("Desconto de " + (valor * 0.05) + " aplicado!\nValor atualizado: " + (valor * 0.95));
        } else {
            System.out.println("Não elegível para desconto :(\n");
        }

        System.out.printf("Selecione a forma de pagamento:\n1- Cartão de Crédito\n2- Boleto\n3-Transferência Bancária\n");
        int paga = scanner.nextInt();

        switch (paga) {
            case 1:
                System.out.println("Forma de pagamento escolhida: Cartão de Crédito");
                break;
            case 2:
                System.out.println("Forma de pagamento escolhida: Boleto");
                break;
            case 3:
                System.out.println("Forma de pagamento escolhida: Transferência bancária");
                break;
            default:
                System.out.println("Número inválido :(");


        }

    }
}

