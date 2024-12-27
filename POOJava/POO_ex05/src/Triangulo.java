public class Triangulo implements Forma {
    public double base;
    public double altura;
    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    @Override
    public void calcularArea() {
        System.out.printf("A Area do triangulo é de %.2f m2\n", (base*altura)/2);
    }
}
