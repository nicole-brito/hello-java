package exercicios.encapsulamento.colaboradores;

public class Main {
    public static void main(String[] args) {
        Colaboradores c1 = new Colaboradores("Nicole", "Brito", 4500.0);
        Colaboradores c2 = new Colaboradores("Keven", "Kniggendorf", 5000.0);

        c1.getSalarioAnual();
        c2.getSalarioAnual();
        c1.setSalarioMensal(c1.getSalarioMensal() + (c1.getSalarioMensal() * 0.1));
        c2.setSalarioMensal(c2.getSalarioMensal()+ (c1.getSalarioMensal() * 0.1));
        System.out.println("Aumento de 10% concedido!");
        c1.getSalarioAnual();
        System.out.println("Aumento de 10% concedido!");
        c2.getSalarioAnual();
    }
}
