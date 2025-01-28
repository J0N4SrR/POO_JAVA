public class Audio {
    private String titulo;
    private int duracaoMinutos;
    private int totalReproducao;
    private int curtida;


    public String getTitulo() {
        return titulo;
    }

    public Audio(String t, int dM){
        this.titulo = t;
        this.duracaoMinutos = dM;
    }



    public void reproduzAudio(){
        this.totalReproducao++;
    }
    public void curtirAudio(){
        this.curtida++;
    }

    private double calcularAvaliacao() {
        if (totalReproducao == 0) {
            return 0; // Sem reproduções, avaliação é 0
        }
        return (double) curtida / (totalReproducao + 1);
    }



    public void informacaoAudio(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Duração: " + this.duracaoMinutos + " Minutos");
        System.out.println("Curtidas: " + this.curtida);
        System.out.println("Avaliação: " + calcularAvaliacao());



    }

}
