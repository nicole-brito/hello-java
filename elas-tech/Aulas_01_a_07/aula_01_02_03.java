package Aulas_01_a_07;

import java.util.Scanner;

public class aula_01_02_03 {
        public static void main(String[] args) {
            int a = 5;
            int b = 3;

            ++a; //6
            System.out.println("Pre-incremento "+ a);

            --b; //2
            System.out.println("Pré decremento "+ b);

            int x = 8;

            System.out.println("Incrimento teste 1 " + x++);
            System.out.println(x);
            System.out.println("Incrimento teste 2 " + x++);
            System.out.println(x);



            int resultado = (((5 + 4) * 3) - 2) ;
            System.out.println("Primeiro exemplo " + resultado);

        int n1, n2, soma, multi, sub;
        double div;
        n1 = 10;
        n2 = 15;
        soma = n1 + n2;
        System.out.println("O resultado da soma " + soma);
        multi = n1 * n2;
        System.out.println("O resultado da multiplicação " + multi);
        sub = n1 - n2;
        System.out.println("O resultado da Subtração " + sub);
        div =  (double) n1 / n2;
        System.out.printf("O resultado da divisão " + div);

            //O codigo até a linha 23 realiza o cadastro de um usuario


        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Cadastro =======");
        System.out.println("Olá usuario, qual sua idade ? ");
        int idade = scanner.nextInt();
        System.out.println("ok, e qual sua altura");
        float altura = scanner.nextFloat();
        System.out.println("legal, e qual seu nome ? ");
        String palavra = scanner.nextLine();
        System.out.println("Uau! " + palavra + " sua idade é " + idade +
                " e sua altura " + altura);
}

}
/**
 * javadoc
 */