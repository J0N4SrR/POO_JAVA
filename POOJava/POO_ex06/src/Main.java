import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContaBancaria> listaConta = new ArrayList<ContaBancaria>();
        for(int i = 0; i < 10; i++ ){
            ContaBancaria p = new ContaBancaria(i+1,i*200);
            listaConta.add(p);
        }

        for(ContaBancaria lista : listaConta){
            lista.ContaDetalhes();
        }
    }
}
