import java.time.LocalDate;
public class ProdutoPerecivel extends Produto {

    public LocalDate dataValidade;
    public ProdutoPerecivel(String nome, double preco, int quantidade,LocalDate data){
        super(nome, preco, quantidade);
        this.dataValidade = data;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }


    @Override
    public String toString() {
        return String.format("%s, dataValidade=%s", super.toString(), dataValidade);
    }
}
