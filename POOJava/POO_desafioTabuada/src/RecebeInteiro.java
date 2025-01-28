import java.util.Scanner;

public class RecebeInteiro {
    private int num;
    private Scanner scanner = new Scanner(System.in);


    public void receberInt(){
        System.out.println("Digite um número inteiro:");
        this.num = scanner.nextInt();
    }

    public int retornaInt(){
        return this.num;
    }


}
