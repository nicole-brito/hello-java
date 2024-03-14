import java.util.Random;
import java.util.Scanner;

public class aula_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*

        //Operador Ternário (IF em uma linha só)
        //(Verificação) ? "se for verdade" : "Se for falso"


        System.out.println("Digite a sua idade: ");

        System.out.println((scanner.nextInt() >= 18) ? "Você é maior de idade" : "Você é menor de idade");



        //Laços de Repetição (FOR)

        for (int i = 10; i >= 0 ; i--) {
            System.out.println("num" + i);
        }

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("num" + i);
        }



        //Exercício
        System.out.printf("Insira um numero positivo: ");

        int i = scanner.nextInt();

        if (i > 0) {
            for (; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Numero inválido");
        }

        int i, idade, cont = 0;
        String nome;

        for(i = 0; i < 5; i++){
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

            if (idade >= 18){
                cont++;
                System.out.println("Usuário maior de idade");
            }else {
                System.out.println("Usuário menor de idade");
            }
        }
        System.out.println("Os usuários maiores de idade são: " + cont);


        //TO DO: crie um programa que pede o nome e idade do usuário, se o usuario for maior de idade armazena esse nome e idade e no final imprime os nomes dos maiores de idade

        Random random = new Random();

        int tent = 5, palpite = 0, numeroDaSorte = random.nextInt(20) + 1;

        System.out.println("=== Adivinhe o número ===");
        System.out.println("Você deve acertar o número que o robô está pensando");

        while (palpite != numeroDaSorte) {
            System.out.println("\nDigite um número, vamos ver se você acerta!");
            palpite = scanner.nextInt();

            if (palpite == numeroDaSorte) {
                System.out.println("Parabéns! Você acertou :)");
            } else if (tent > 0) {
                if (palpite < numeroDaSorte) {
                    System.out.println("Tente um número maior");
                } else {
                    System.out.println("Tente um número menor");
                }
                System.out.println("Cuidado! Você só tem " + tent-- + " tentativas");
                for (int i = 3; i > 0; i--) {
                    System.out.println("Nova tentativa em " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            } else {
                System.out.println("Game Over :( O número era: " + numeroDaSorte);
                tent = 0;
            }
        }
*/
        //===== ARRAYS ====

        int numero;
        numero = 12;

        int[] numeros = new int[3];
        // [  2  |  5  |  4  ]

        numeros[0] = 2;
        numeros[1] = 5;
        numeros[2] = 4;

        for(int i = 0; i < 3 ; i++){
            System.out.println("O array na posição " + i + " é " + numeros[i]);
        }
        System.out.println("Todos os números são: ");

        System.out.println("O valor na primeira posição do array é " + numeros[0]);
        System.out.println("O valor na segunda posição do array é " + numeros[1]);
        System.out.println("O valor na terceira posição do array é " + numeros[2]);
    }
}
