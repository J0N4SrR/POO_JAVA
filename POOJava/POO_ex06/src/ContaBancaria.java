public class ContaBancaria {
    private int numConta;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(int num, double s){
        setSaldo(s);
        setNumConta(num);
    }

    public void ContaDetalhes(){
        System.out.printf("Numero da conta: %d\n", getNumConta());
        System.out.printf("Saldo: %.1f\n", getSaldo());
    }

}
