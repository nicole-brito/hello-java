package exercicios.encapsulamento.suprimentos;

public class Suprimentos {
    private int numItem;
    private String descItem;
    private int quantItem;
    private double precoUnItem;

    public Suprimentos(int numItem, String descItem, int quantItem, double precoUnItem) {
        this.numItem = numItem;
        this.descItem = descItem;
        this.quantItem = quantItem > 0 ? quantItem : 0;
        this.precoUnItem = precoUnItem > 0 ? precoUnItem : 0.0;
    }
    public void getNumItem() {
        System.out.println("O ID do item é: " + numItem);
    }
    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }
    public void  getDescItem() {
        System.out.println("O item " + numItem + " é: " + descItem);
    }
    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }
    public void getQuantItem() {
        System.out.println("A quantidade de " + descItem + " é de: " + quantItem);
    }
    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }
    public void getInvoiceAmount() {
        System.out.println("O valor da sua fatura é de: " + quantItem * precoUnItem);
    }
}
