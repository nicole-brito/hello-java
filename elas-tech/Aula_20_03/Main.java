package Aula_20_03;

public class Main {
    public static void main(String[] args) {
        //Criar um objeto
        animal animal1 = new animal("Girafa", 15);
        animal animal2 = new animal("Leão", 45);

        //Mostrar os atributos e também os métodos
        System.out.println("O nome do animal é " + animal1.getNome());
        System.out.println("A idade é " + animal1.getIdade());
        animal1.aniverAnimal();
        System.out.println("A nova idade do animal é " + animal1.getIdade());
        System.out.println("O nome do animal 2 é " + animal2.getNome());
        System.out.println("A idade é " + animal2.getIdade());
        animal2.aniverAnimal();
        System.out.println("A nova idade do animal é " + animal2.getIdade());

        animal animal3 = new animal("Corvo", 80);
        System.out.println("====");
        System.out.println("Nome do Animal 3: " + animal3.getNome());


    }
}
