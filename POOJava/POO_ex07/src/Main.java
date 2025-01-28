import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Crie uma lista de números inteiros e utilize o metodo Collections.sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>(Arrays.asList(7, 9, 3, 5, 8, 1));

        for( int i = 0; i < 10; i++){
            listNum.add((i * i) - i );
        }

        System.out.printf("\nDesordenado: " + listNum);
        Collections.sort(listNum);
        System.out.printf("\nOrdenado: " + listNum);




    }
}
