public class Livro {

    private String titulo;
    private String autor;
    private int numPaginas;

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de Páginas: " + this.numPaginas);
    }

    // metodo construtor
    public Livro(){
        this.titulo = "The night we met";
        this.autor = "Lord Huron";
        this.numPaginas = 1024;
    }

    void lerPagina(int x){
        int pagRestante = (this.numPaginas - x);
        System.out.printf("Parabéns! Você leu %d páginas do livro %s\n", x, this.titulo);
        System.out.printf("Faltam apenas %d páginas", pagRestante);

    }

    void setTitulo(String t){
        this.titulo = t;
    }

    String getTitulo(){
        return this.titulo;
    }

    void setAutor(String a){
        this.autor = a;
    }

    String getAutor(){
        return this.autor;
    }

    void setNumPaginas(int n){
        this.numPaginas = n;
    }

    int getNumPaginas(){
        return this.numPaginas;
    }


}

