import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;


    public void exibirDetalhes(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Idade: %i\n", this.idade);
        System.out.printf("Altura: %f\n", this.altura);
    }

    void setNome(String n){
        this.nome = n;
    }

    String getNome(){
        return this.nome;
    }

    void setIdade(int i){
        this.idade = i;
    }

    int getIdade(){
        return this.idade;
    }

    void setAltura( double a){
        this.altura = a;
    }
    double getAltura(){
        return this.altura;
    }

    void aniverssario(){
        this.idade += 1;
    }

}
