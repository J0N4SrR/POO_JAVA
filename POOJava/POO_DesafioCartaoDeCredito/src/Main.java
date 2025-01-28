import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        double limite;

        List<Compra> listaCompras = new ArrayList<>();

        System.out.println("Digite o limite do seu cartão:");
        limite = Double.parseDouble(scanner.nextLine());
        do{
            Compra c = new Compra();
            c.receberValores();
            if(c.getValorCompra() > limite){
                System.out.println("Você não tem limite para essa compra!");
                break;
            } else{
                limite -= c.getValorCompra();
                listaCompras.add(c);
                System.out.println("Compra Realizada");

            }
            System.out.println("Digite 0 para continuar comprando ou 1 para sair");
            opc = scanner.nextInt();
        }while(opc != 1);
        Collections.sort(listaCompras);
        System.out.println("####################");
        System.out.println("COMPRAS REALIZADAS");
        for(Compra compra: listaCompras){
            System.out.println(compra);
        }
        System.out.println("Limite Atual: "+ limite);
        System.out.println("####################");







    }
}
