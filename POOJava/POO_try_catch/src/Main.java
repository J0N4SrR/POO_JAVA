import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num1, num2, div;
        Scanner scanner = new Scanner(System.in);
        System.out.println("O programa irá dividir dois numeros!");

        try {
            System.out.println("Digite o primeiro numero:");
            num1 = scanner.nextDouble();
            System.out.println("Digite o segundo numero:");
            num2 = scanner.nextDouble();
            if(num2 == 0){
                throw new ArithmeticException();
            }
            div = num1 / num2;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("Não se pode realizar esse tipo de operação!");
        }
        catch (Exception e){
            System.out.println("Entrada invalida!");
        }
        finally {
            scanner.close();
            System.out.println("Programa encerrado.");
        }




    }
}
