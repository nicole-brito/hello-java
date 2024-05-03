import java.math.BigDecimal;

public class Produto {
    private String descricao;
    private BigDecimal preco;
    private boolean possuiDimensoes;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public boolean isPossuiDimensoes() {
        return possuiDimensoes;
    }

    public void setPossuiDimensoes(boolean possuiDimensoes) {
        this.possuiDimensoes = possuiDimensoes;
    }

}