import java.util.List;


public class Podcast extends Audio {
    private String host;
    private List<String> convidado;


    public Podcast(String t, int dM, String h) {
        super(t, dM);
        this.host = h;

    }

    public void addConvidado(String c){
        this.convidado.add(c);
    }

    public void trocarHost(String h){
        this.host = h;
    }
}
