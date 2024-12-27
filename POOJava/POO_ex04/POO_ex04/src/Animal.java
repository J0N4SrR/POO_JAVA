// Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro e faça o casting para a classe Animal.
public class Animal {
    private boolean vertebrado;
    private String filo;
    private String especie;

    public Animal(boolean v, String f, String e){
        this.vertebrado = v;
        this.filo = f;
        this.especie = e;
    }

    public boolean isVertebrado() {
        return vertebrado;
    }

    public void setVertebrado(boolean vertebrado) {
        this.vertebrado = vertebrado;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo");
    }
    public void comer(){
        System.out.println("Comendo");
    }
    public void respirar(){
        System.out.println("Respirando");
    }
}
