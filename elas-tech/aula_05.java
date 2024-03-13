import java.util.Scanner;

public class aula_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*

        //Operador Ternário (IF em uma linha só)
        //(Verificação) ? "se for verdade" : "Se for falso"


        System.out.println("Digite a sua idade: ");

        System.out.println((scanner.nextInt() >= 18) ? "Você é maior de idade" : "Você é menor de idade");
*/
/*

        //Laços de Repetição (FOR)

        for (int i = 10; i >= 0 ; i--) {
            System.out.println("num" + i);
        }

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("num" + i);
        }
*/

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
    }
}
