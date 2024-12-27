public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(){
        this.volume += 1;

    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void setLigado(){
        this.ligado = !this.ligado;
    }

    public boolean getTocando(){
        return this.tocando;
    }

    public void setTocando(){
        this.tocando = !this.tocando;
    }

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            setLigado();
        }
    }

    @Override
    public void desligar() {
        if(this.ligado){
            setLigado();
        }
    }

    @Override
    public void abrirMenu() {
        System.out.print("Volume: ");
        for(int i = 0 ; i < getVolume(); i ++){
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void maisVolume() {

    }

    @Override
    public void menosVolume() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
