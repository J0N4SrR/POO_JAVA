public class ContaBanco {

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public String getTipoConta(){
        return this.tipoConta;
    }

    public String getDonoConta(){
        return this.donoConta;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setNumConta(int newNum){
        this.numConta = newNum;
    }

    public void setTipoConta(String newTipo){
        this.tipoConta = newTipo;
    }

    public void setDonoConta(String newDono){
        this.donoConta = newDono;
    }
    public void setSaldo(float newSaldo){
        this.saldo = newSaldo;
    }
    public void setStatus(){
        this.status = !this.status;
    }

    public void abrirConta(String Tipo){
        if(!this.status){
            this.setStatus();
            this.setTipoConta(Tipo);

            if(this.tipoConta.equals("CC")){
                this.saldo += 50;
            }
            if(this.tipoConta.equals("CP")){
                this.saldo += 150;
            }
        }
    }
    public void fecharConta(){
        if(this.status && this.saldo != 0){
            this.status = false;
        } else {
            System.out.println("A conta nao pode ser fechada. Confirme se não há saldo ou débitos antes de realizar a inativação");
        }
    }

    public void depositar(float d){
        if(this.status){
            this.saldo += d;
        } else {
            System.out.println("Não foi possivel realizar o depósito");
        }
    }

    public void sacar(float s){
        if(this.status && this.saldo >= s){
            this.saldo -= s;
        } else{
            System.out.println("Não foi possivel relizar o saque");
        }
    }

    public void pagarMensalidade(){
        if(this.status){
            if(this.tipoConta.equals("CC")){
                this.saldo -= 12;
            }
            if(this.tipoConta.equals("CP")){
                this.saldo -= 20;
            }

        }
    }

}