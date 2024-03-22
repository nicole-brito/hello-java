package exercicios.encapsulamento.colaboradores;

public class Colaboradores {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    public Colaboradores(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public void getSalarioAnual() {
        System.out.println("O salário anual de " + nome + " " + sobrenome + " é de: " + salarioMensal * 12);
    }
}
