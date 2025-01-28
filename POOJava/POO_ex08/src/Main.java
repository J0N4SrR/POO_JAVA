import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
public class Main {
    public static void main(String[] args) {
        List<Titulo> listaTitulo = new ArrayList<>(Arrays.asList(
                new Titulo("A Origem (Inception)"),
                new Titulo("O Poderoso Chefão (The Godfather)"),
                new Titulo("O Senhor dos Anéis: A Sociedade do Anel (The Lord of the Rings: The Fellowship of the Ring)"),
                new Titulo("O Rei Leão (The Lion King)"),
                new Titulo("Interestelar (Interstellar)"),
                new Titulo("A Vida é Bela (La Vita è Bella)"),
                new Titulo("Pulp Fiction"),
                new Titulo("Matrix (The Matrix)")));

        System.out.printf("Desordenado: " + listaTitulo + "\n\n");
        Collections.sort(listaTitulo);
        System.out.printf("Ordenado: " + listaTitulo + "\n\n");



    }
}
