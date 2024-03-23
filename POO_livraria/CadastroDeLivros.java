import javax.swing.plaf.synth.SynthSeparatorUI;

public class CadastroDeLivros {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos de linguagem";
        livro.valor = 59.90;
        livro.isbn = "988-92-4322-4";

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Vire um garoto de programa";
        outroLivro.valor = 54.90;
        outroLivro.isbn = "234-22-4549-9";

        outroLivro.mostrarDetalhes();
    }
}
