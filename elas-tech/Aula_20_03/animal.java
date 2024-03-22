package Aula_20_03;

public class animal {
    //Atributos
    private String nome;
    int idade;

    public animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void aniverAnimal(){
        idade++;
    }

    public void insereBD(){
        System.out.println("Inserido no banco de dados com sucesso");
    }
}
