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
    public int getNumItem() {
        return numItem;
    }
    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }
    public String getDescItem() {
        return descItem;
    }
    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }
    public int getQuantItem() {
        return quantItem;
    }
    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }
    public void getInvoiceAmount() {
        System.out.println("O valor da sua fatura é de: " + quantItem * precoUnItem);
    }
}
