package exercicios.encapsulamento.suprimentos;

public class Main {
    public static void main(String[] args) {
        Suprimentos suprimentos = new Suprimentos(10, "Whey", 10, 50.0);
        suprimentos.getDescItem();
        suprimentos.getNumItem();
        suprimentos.getQuantItem();
        suprimentos.getInvoiceAmount();
    }
}
