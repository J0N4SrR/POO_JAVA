// Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double d = 0;

        Animal a1 = new Animal(true,"Cordados","Canis lupus");
        Cachorro c1 = new Cachorro(true,"Cordados","Canis lupus familiaris",4,"Costela","Maria Helena");

        a1.comer();
        a1.reproduzir();
        a1.respirar();

        System.out.println(c1 instanceof Animal);
        c1.comer();
        c1.reproduzir();
        c1.respirar();


        ArrayList<String> animais = new ArrayList<String>();
        animais.add("Galinha");
        animais.add("Cachorro");
        animais.add("Tubarão");
        animais.add("Barata");
        animais.add("Coelho");
        animais.add("Tartaruga");
        animais.add("Touro");
        animais.add("Coruja");
        animais.add("Pavão");
        animais.add("Sapo");
        animais.add("Rato");

        for(String animal:animais){
            System.out.println(animal);
        }

        Produto p1 = new Produto("Arroz", 12);
        Produto p2 = new Produto("Feijão", 8.5);
        Produto p3 = new Produto("Costela", 32);
        Produto p4 = new Produto("Macarrão", 6);
        Produto p5 = new Produto("Batata", 8);
        Produto p6 = new Produto("Alface", 3.5);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);
        produtos.add(p6);


        double somaPrecos = 0.0;
        for(Produto produto: produtos){
            somaPrecos += produto.getPreco();
        }
        System.out.printf("A valor médio dos produtos é: %f", somaPrecos/ produtos.size());








    }

}
