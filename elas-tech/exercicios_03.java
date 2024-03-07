import java.util.Scanner;

public class exercicios_03 {

    public static void main(String[] args) {

        //Exercício 1
        int n1, n2, n3, n4, n5, n6;
        n1 = 8;
        n2 = 9;
        n3 = 7;
        n4 = 4;
        n5 = 5;
        n6 = 6;
        double m1, m2, som, mf;
        m1 = (n1 + n2 + n3) / 3;
        m2 = (n4 + n5 + n6) / 3;
        som = m1 + m2;
        mf = (m1 + m2) / 2;

        System.out.println("===Exercício 1===");
        System.out.println("A média aritmética dos números 8, 9 e 7 é: " + m1);
        System.out.println("A média aritmética dos números 4, 5 e 6 é: " + m2);
        System.out.println("A soma das duas médias é: " + som);
        System.out.println("A média das médias é: " + mf);
        System.out.println(" ");

        //Exercício 2
        System.out.println("===Exercício 2===");
        Scanner scanner = new Scanner(System.in);
        int suc, ant;
        System.out.println("Digite um número inteiro: ");
        int num_int = scanner.nextInt();
        ant = num_int - 1;
        suc = num_int + 1;

        System.out.println("O antecessor de " + num_int + " é: " + ant);
        System.out.println("O sucessor de " + num_int + " é: " + suc);
        System.out.println(" ");


        //Exercício 3
        //verifica se é par
        System.out.println("===Exercício 3===");
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }
        System.out.println(" ");
        double dez_porc = num * 0.1;
        System.out.println("10% de " + num + " é: " + dez_porc);
        System.out.println(" ");
        int dobro = num * 2;
        System.out.println("O dobro de " + num + " é: " + dobro);
        System.out.println(" ");


        //Exercício 4
        System.out.println("===Exercício 4===");
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite seu endereço: ");
        String endereco = scanner.next();
        System.out.println("Esses são seus dados de cadastro:\n" +
                "Nome: " + nome + " " + sobrenome + "\n" +
                "Idade: " + idade + "\n" +
                "Endereço: " + endereco);
        System.out.println(" ");


        //Exercício 5
        System.out.println("===Exercício 5===");
        System.out.println("Qual seu nome?");
        String nome5 = scanner.next();
        System.out.println(nome5 + ", qual a sua idade? ");
        int idade5 = scanner.nextInt();
        System.out.println("e você já fez aniversário esse ano, " + nome5 + "? (S/N)");
            String aniver = scanner.next();
            if (aniver == "S" || aniver == "s") {
                System.out.println("Você nasceu no ano de: " + (2024 - idade5));
            } else {
                System.out.println("Você nasceu no ano de: " + (2023 - idade5));
            }
        }
        //System.out.println("Você nasceu no ano de: " + (2024 - idade5));


    }

