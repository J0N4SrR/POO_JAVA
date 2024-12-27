import java.util.ArrayList;
import java.util.Arrays;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String s, double d, int q){
        this.nome = s;
        this.preco = d;
        this.quantidade = q;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format("Produto[nome='%s', preco=%.2f, quantidade=%d]", nome, preco, quantidade);
    }
}
