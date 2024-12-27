import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(4);
        Triangulo t1 = new Triangulo(2,2.5);
        Quadrado q2 = new Quadrado(3);
        Triangulo t2 = new Triangulo(3,5.4);
        Quadrado q3 = new Quadrado(2);
        Triangulo t3 = new Triangulo(2.5,3.6);
        Quadrado q4 = new Quadrado(8);
        Triangulo t4 = new Triangulo(2.5,3.9);

        ArrayList<Forma> forma = new ArrayList<Forma>();
        forma.add(q1);
        forma.add(t1);
        forma.add(q2);
        forma.add(t2);
        forma.add(q3);
        forma.add(t3);
        forma.add(q4);
        forma.add(t4);

        for(Forma f: forma){
            f.calcularArea();
        }
    }
}
