public class Quadrado implements Forma {
    double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public void calcularArea() {
        System.out.printf("A Area do quadrado é de %.2f m2\n", lado*lado);
    }
}
