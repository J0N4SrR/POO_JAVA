public class Cachorro extends Animal {

    private int idade;
    private String nome;
    private String tutor;

    Cachorro(boolean v, String f, String e, int i, String n, String t){
        super(v, f, e);
        this.idade = i;
        this.nome = n;
        this.tutor = t;
    }

    @Override
    public void reproduzir(){
        System.out.println("Reprodução: Sexuada por Cópula");
    }

    @Override
    public void comer(){
        System.out.println("Alimentação: Carnívoro");
    }

    @Override
    public void respirar(){
        System.out.println("Respirando: Pulmonar");
    }

}
