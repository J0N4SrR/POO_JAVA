import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> produtoLoja = new ArrayList();
        Produto  p1 = new Produto("OMO",8.5, 5);
        Produto  p2 = new Produto("Ipe",5.5, 4);
        produtoLoja.add(p1);
        produtoLoja.add(p2);
        System.out.println("Tamanho da lista: " + produtoLoja.size());
        System.out.printf("%s - %f - %d\n",p2.getNome(),p2.getPreco(),p2.getQuantidade());
        String string = p1.toString();
        System.out.println(string);
        ProdutoPerecivel p3 = new ProdutoPerecivel("Iogurte", 5.5, 10, LocalDate.of(2024, 12, 31));
        System.out.println(p3);
    }
}
