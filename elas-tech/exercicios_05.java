import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exercicios_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("️\n =========================");
        System.out.println("|                         |");
        System.out.println("|          Menu           |");
        System.out.println("|                         |");
        System.out.println(" =========================\n");

        System.out.println("Atividades disponíveis:");
        System.out.println("1 - Contagem Regressiva");
        System.out.println("2 - Tabuada");
        System.out.println("3 - Soma dos Pares");
        System.out.println("4 - Verificador de Primos");
        System.out.println("5 - Fibonacci");
        System.out.println("6 - Média dos Positivos");
        System.out.println("7 - Calculadora");
        System.out.println("8 - Adivinhe o Número");
        System.out.println("9 - Conversor de Temperaturas");
        System.out.println("10 - Lista de Compras");

        System.out.println("️\n =========================");

        int digitoMenu = scanner.nextInt();

        switch (digitoMenu) {
            case 1:
                System.out.println("️\n ====== Exercício 1 ======");
                System.out.println("|                         |");
                System.out.println("|  Contagem Regressiva    |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");

                for (int i = 10; i >= 0; i-- ){
                    System.out.println(i);
                }
                break;
            case 2:
                System.out.println("️\n ====== Exercício 2 ======");
                System.out.println("|                         |");
                System.out.println("|         Tabuada         |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");

                System.out.printf("\nDigite um número para ver sua tabuada: ");

                int tabuada = scanner.nextInt();

                for (int i = 10; i >= 1; i-- ){
                    System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
                }
                break;
            case 3:
                System.out.println("️\n ====== Exercício 3 ======");
                System.out.println("|                         |");
                System.out.println("|     Soma dos Pares      |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");

                int soma = 0;
                for (int i = 0; i <= 100; i++){
                    if (i % 2 == 0){
                        soma += i;
                    }
                }
                System.out.println("\nA soma dos números pares de 1 a 100 é: " + soma);
                break;
            case 4:
                System.out.println("️\n ====== Exercício 4 ======");
                System.out.println("|                         |");
                System.out.println("|  Verificador de Primos  |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");

                System.out.printf("Digite um número para verificar se é primo ou não: ");
                int primo = scanner.nextInt();

                if (primo / 2 == 0 || primo / 3 == 0 || primo / 4 == 0 || primo / 5 == 0 || primo / 6 == 0 || primo / 7 == 0) {
                    System.out.println("O número é primo");
                }else {
                    System.out.println("O número não é primo");
                }
                break;
            case 5:
                System.out.println("️\n ====== Exercício 5 ======");
                System.out.println("|                         |");
                System.out.println("|        Fibonacci        |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");

                int n1 = 0, n2 = 1;
                for (int i = 0; i < 20; i++){
                    int n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.println(n1);
                }
                break;
            case 6:
                System.out.println("️\n ====== Exercício 6 ======");
                System.out.println("|                         |");
                System.out.println("|  Média dos Positivos    |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");

                int numero, soma6 = 0, cont = 0;
                System.out.println("Digite um número: ");
                numero = scanner.nextInt();

                while (numero >= 0) {
                    soma6 += numero;
                    cont++;
                    System.out.println("\nDigite outro número positivo ou um negativo para calcular a média dos positivos: ");
                    numero = scanner.nextInt();
                }
                System.out.println("\nA média dos números inseridos é: " + (soma6 / cont));
                break;
            case 7:
                System.out.println("️\n ====== Exercício 7 ======");
                System.out.println("|                         |");
                System.out.println("|        Calculadora      |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");
                int digito;

                System.out.println("Escolha a operação:");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("0 - Sair");

                digito = scanner.nextInt();

                while (digito != 0) {
                    System.out.println("Digite o primeiro número: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Digite o segundo número: ");
                    int num2 = scanner.nextInt();
                    int resultado = 0;
                    switch (digito) {
                        case 1:
                            resultado = num1 + (num2);
                            break;
                        case 2:
                            resultado = num1 - (num2);
                            break;
                        case 3:
                            resultado = num1 * num2;
                            break;
                        case 4:
                            resultado = num1 / num2;
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    System.out.println("Resultado: " + resultado);
                    System.out.println("=== FIM ===");

                    System.out.println("Escolha a operação:");
                    System.out.println("1 - Soma");
                    System.out.println("2 - Subtração");
                    System.out.println("3 - Multiplicação");
                    System.out.println("4 - Divisão");
                    System.out.println("0 - Sair");
                    digito = scanner.nextInt();


                }
                break;
            case 8:
                System.out.println("️\n ====== Exercício 8 ======");
                System.out.println("|                         |");
                System.out.println("|    Adivinhe o Número    |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");
                Random random = new Random();

                int tent = 5, palpite = 0, numeroDaSorte = random.nextInt(100) + 1;

                System.out.println("Você deve acertar o número que o robô está pensando");

                while (palpite != numeroDaSorte) {
                    System.out.println("\nDigite um número, vamos ver se você acerta!");
                    palpite = scanner.nextInt();

                    if (palpite == numeroDaSorte) {
                        System.out.println("Parabéns! Você acertou :)\n");
                    } else if (tent > 0) {
                        if (palpite < numeroDaSorte) {
                            System.out.println("Tente um número maior\n");
                        } else {
                            System.out.println("Tente um número menor\n");
                        }
                        System.out.println("Cuidado! Você só tem " + tent-- + " tentativas\n");
                        for (int i = 3; i > 0; i--) {
                            System.out.println("Nova tentativa em " + i);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {

                                e.printStackTrace();
                            }
                        }
                    } else {
                        System.out.println("\nGame Over :( O número era: " + numeroDaSorte);
                        tent = 0;
                    }
                }
                break;
            case 9:
                System.out.println("️\n ====== Exercício 9 ======");
                System.out.println("|                         |");
                System.out.println("|Conversor de Temperaturas|");
                System.out.println("|                         |");
                System.out.println(" =========================\n");
                int digito9;

                System.out.println("Escolha a temperatura que deseja converter:");
                System.out.println("1 - Celsius para Fahrenheit");
                System.out.println("2 - Fahrenheit para Celsius\n");

                digito9 = scanner.nextInt();

                while (digito9 != 0) {
                    System.out.println("Digite a temperatura: ");
                    int temperatura = scanner.nextInt();
                    int resultado = 0;
                    switch (digito9) {
                        case 1:
                            resultado = (temperatura * 9/5) + 32;
                            break;
                        case 2:
                            resultado = (temperatura - 32) * 5/9;
                            break;
                        default:
                            System.out.println("Opção inválida\n");
                            break;
                    }
                    System.out.println("A temperatura convertida é: " + resultado);

                }
                break;
            case 10:
                System.out.println("️\n ===== Exercício 10 =====");
                System.out.println("|                         |");
                System.out.println("|     Lista de Compras    |");
                System.out.println("|                         |");
                System.out.println(" =========================\n");
                ArrayList<String> lista = new ArrayList<String>();
                String item;
                System.out.println("Insira um item da sua lista de compras: ");

                item = scanner.next();

                while (!item.equals("fim")) {
                    System.out.println("\nDigite mais itens ou fim para finalizar e exibir a lista: ");
                    item = scanner.next();
                    lista.add(item);

                }
                System.out.println("\nSua lista de compras é: " + lista);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}

