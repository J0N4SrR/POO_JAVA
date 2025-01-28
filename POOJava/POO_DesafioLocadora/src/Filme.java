public class Filme {
    private String titulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somAvaliacao;
    private int totalDeAvaliacao;

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public int getAnoDeLancamento() {
          return anoDeLancamento;
     }

     public void setAnoDeLancamento(int anoDeLancamento) {
          this.anoDeLancamento = anoDeLancamento;
     }

     public boolean isIncluidoNoPlano() {
          return incluidoNoPlano;
     }

     public void setIncluidoNoPlano(boolean incluidoNoPlano) {
          this.incluidoNoPlano = incluidoNoPlano;
     }

     public double getSomAvaliacao() {
          return somAvaliacao;
     }

     public void setSomAvaliacao(double somAvaliacao) {
          this.somAvaliacao = somAvaliacao;
     }

     public int getTotalDeAvaliacao() {
          return totalDeAvaliacao;
     }

     public void setTotalDeAvaliacao(int totalDeAvaliacao) {
          this.totalDeAvaliacao = totalDeAvaliacao;
     }

     public void exibeFichaTecnica(){
         System.out.printf("Titulo: %s", this.titulo);
         System.out.printf("Ano de lançamento: %d", this.anoDeLancamento);
         System.out.printf("Incluso: %b", this.incluidoNoPlano);
         System.out.printf("Avaliação: %f.1", this.somAvaliacao);
         System.out.printf("Numero de avaliações: %d", this.totalDeAvaliacao);
    }

    public void somaAvaliacao(double nota){
          this.somAvaliacao += nota;
          this.totalDeAvaliacao++;
    }

    public double retornaMedia(){
          return this.somAvaliacao/this.totalDeAvaliacao;
    }


}
