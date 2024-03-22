package Aulas_01_a_07;

import java.util.Scanner;

public class aula_04 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Selecione uma das opções do menu");
        System.out.println("1 - Verificar se voce foi aprovado");
        System.out.println("2 - Verificar o seu holerite");
        System.out.println("3 - Verificar se voce é maior ou menor de idade");
        System.out.println("4 - Verificar se a palavra é palíndromo");
        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a nota: ");
                leitura = new Scanner(System.in);
                double nota = leitura.nextDouble();
                if (nota >= 7.0) {
                    System.out.println("Aprovado");
                } else if (nota < 5.9) {
                    System.out.println("Reprovado");
                } else {
                    System.out.println("Você está de recuperação :( \n Digite sua nota da recuperação");
                    double notaRecuperacao = leitura.nextDouble();
                    if (notaRecuperacao >= 5.0) {
                        System.out.println("Aprovado");
                    } else {
                        System.out.println("Reprovado");
                    }
                }
                break;
            case 2:
                System.out.println("Digite o valor da sua hora de trabalho: ");
                leitura = new Scanner(System.in);
                int valorHora = leitura.nextInt();
                System.out.println("Digite a quantidade de horas trabalhadas");
                int quantHora = leitura.nextInt();
                int salario = (valorHora * quantHora);
                double INSS = salario * 0.1;
                double FGTS = salario * 0.11;
                double IR = 0;
                double sindicato = salario * 0.03;

                System.out.println("Salário Bruto (" + valorHora + " *" + quantHora + "): " + salario);
                if (salario <= 900) {
                    System.out.println("Desconto IR: ISENTO");
                } else if (salario <= 1500) {
                    IR = salario * 0.05;
                    System.out.println("Desconto IR (5%): " + IR);
                } else if (salario <= 2500) {
                    IR = salario * 0.1;
                    System.out.println("Desconto IR (10%): " + IR);
                } else {
                    IR = salario * 0.2;
                    System.out.println("Desconto IR (20%): " + IR);
                }
                System.out.println("INSS (10%): " + INSS);
                System.out.println("FGTS (11%): " + FGTS);
                System.out.println("Total de Descontos: " + (IR + INSS));
                System.out.println("Salário Liquido: " + (salario - IR - INSS - sindicato));
                break;
            case 3:
                System.out.println("Qual a sua idade ? ");
                int idade = leitura.nextInt();

                if (idade >= 18) {
                    System.out.println(" Voce é Maior de idade");
                } else {
                    System.out.println("Voce é menor de idade!!");
                }
                break;
            case 4:
                leitura = new Scanner(System.in);
                System.out.println("Digite uma palavra: ");
                String palavra = leitura.nextLine();
                String palavraInvertida = new StringBuilder(palavra).reverse().toString();
                if (palavra.equals(palavraInvertida)) {
                    System.out.println("A palavra é um palíndromo");
                } else {
                    System.out.println("A palavra não é um palíndromo");
                }
                break;
            default:
                System.out.println("Fim do menu");
        }



    }
}


