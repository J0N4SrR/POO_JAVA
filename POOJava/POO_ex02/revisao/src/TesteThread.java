public class TesteThread {
    public static void main(String[] args) {

        Thread threadExecucao = new Thread(new MinhaThread());
        threadExecucao.start();
        Thread threadExecucao2 = new Thread(new MinhaThread());
        threadExecucao2.start();
        Thread threadExecucao3 = new Thread(new MinhaThread());
        threadExecucao3.start();


    }
}
