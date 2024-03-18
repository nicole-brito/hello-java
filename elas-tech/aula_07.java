import java.util.*;

public class aula_07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

       /* //Declarando o Array
        ArrayList<String> listaNomes = new ArrayList<>();

        //Add elementos
        listaNomes.add("Nicole");
        listaNomes.add("Keven");
        listaNomes.add("Ingrid");
        listaNomes.add("Manjericas");

        System.out.println("Lista de Nomes: " + listaNomes);

        String nome1 = listaNomes.get(0);
        System.out.println("Primeiro nome: " + nome1);

        System.out.println("Mostrando todos os elementos: ");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        //Remove item
        listaNomes.remove("Nicole");
        System.out.println("Excluido");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("O nome é " + listaNomes.get(i) + "E a posição é " + i);
        }*/

     /*   System.out.println("Digite sair para finalizar e nomes: ");

        ArrayList<String> nomes = new ArrayList<>();
        String nome = "entrada";

        *//*while (!nome.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome");
            nome = leitura.nextLine();
            nomes.add(nome);
        }*//*

        while (true) {
            System.out.println("Digite o nome: ");
            nome = leitura.nextLine();
            if (nome.equals("sair")){
                break;
            } else {
                nomes.add(nome);
            }
        }

        String procuraNome = "Nicole";

        if (nomes.contains(procuraNome)){
            System.out.println("O nome existe");
        } else {
            System.out.println("Não existe");
        }*/

        //Set<String> noms = new LinkedHashSet<>(); <- Ordem de Inserção
        //Set<String> noms = new HashSet<>(); <- Sabe Deus a ordem
        /*Set<String> noms = new TreeSet<>(); //Ordem Alfabética

        noms.add("Rafa");
        noms.add("AAA");
        noms.add("Ana Banana");
        noms.add("Severino");
        noms.add("OTORRINOLARINGOLOGISTA");
        noms.add("oTO Rino Lari");

        System.out.println(noms);*/


        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.println("\nLista de Tarefas\nDigite um comando:\n1- Inserir tarefa\n2- Excluir tarefa\n3- Listar tarefas\n4- Sair");

            int menu = leitura.nextInt();

            switch (menu) {
                case 1:
                    leitura.nextLine();
                    System.out.println("\nDigite a tarefa: ");
                    tarefas.add(leitura.nextLine());
                    System.out.println("\nCadastrada com sucesso!");
                    break;
                case 2:
                    System.out.println("\nExcluir tarefa");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println("Indíce: " + (i + 1) + " Tarefa: " + tarefas.get(i));
                    }
                    System.out.println("Digite o número que quer apagar: ");
                    int apagar = leitura.nextInt();
                    tarefas.remove((apagar - 1));
                    System.out.println("Tarefa excluída com sucesso!");
                    break;
                case 3:
                    System.out.println("\nSuas tarefas são: \n");
                    for (String mostrar : tarefas) {
                        System.out.println(mostrar);
                    }
                    break;
                case 4:
                    System.out.println("\nSair");
                    return;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }

        }
    }

}
