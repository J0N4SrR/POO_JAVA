
//Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
public class Titulo implements Comparable<Titulo> {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Titulo(String n){
        setNome(n);
    }


    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.getNome());
    }
}
