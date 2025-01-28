import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RecebeInteiro r1 = new RecebeInteiro();


        r1.receberInt();
        System.out.println("############################");
        System.out.printf("Tabuada do: %d\n", r1.retornaInt());
        for(int i = 1 ; i < 11; i++){
            System.out.printf("%d X %d = %d\n", i,r1.retornaInt(),i* r1.retornaInt());
        }


    }
}
