public class Ex1 {

    public static void main(String[] args) {

        Livro lv1 = new Livro();
        Livro lv2 = new Livro();
        lv1.setTitulo("Moana");
        lv1.exibirDetalhes();
        lv2.exibirDetalhes();
        System.out.println("##################################");

        Pessoa p1 = new Pessoa();
        p1.setNome("Joana");
        p1.setIdade(12);
        p1.setAltura(1.2);
        p1.exibirDetalhes();
        p1.aniverssario();
        p1.aniverssario();
        p1.aniverssario();
        p1.exibirDetalhes();


    }
}
