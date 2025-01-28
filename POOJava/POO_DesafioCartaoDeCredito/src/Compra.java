import java.util.Scanner;

public class Compra implements Comparable<Compra> {
    private String descCompra;
    private double valorCompra;
    Scanner scanner = new Scanner(System.in);

    public void receberValores(){
        System.out.println("Digite a descrição da compra:");
        setDescCompra(scanner.nextLine());
        System.out.println("Digite o valor da compra:");
        setValorCompra(Double.parseDouble(scanner.nextLine()));

    }

    public String getDescCompra() {
        return descCompra;
    }

    public void setDescCompra(String descCompra) {
        this.descCompra = descCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    @Override
    public String toString() {
        return "Descrição: " + descCompra + "- Valor: R$" + valorCompra;
    }

    @Override
    public int compareTo(Compra o) {
        return Double.compare(this.valorCompra, o.valorCompra);
    }
}
