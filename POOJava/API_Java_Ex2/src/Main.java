import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String json = "{\"nome\": \"Jonass\", \"idade\": 28, \"cidade\": \"Monte Sião\"}";
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
