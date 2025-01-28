import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaAudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Audio> biblioteca = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n#### MENU ####");
            System.out.println("1 - Adicionar uma música");
            System.out.println("2 - Adicionar um podcast");
            System.out.println("3 - Curtir um áudio");
            System.out.println("4 - Reproduzir um áudio");
            System.out.println("5 - Listar todos os áudios");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título da música: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Duração (minutos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();
                    biblioteca.add(new Musica(titulo, duracao, artista));
                    System.out.println("Música adicionada com sucesso!");
                }
                case 2 -> {
                    System.out.print("Título do podcast: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Duração (minutos): ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    System.out.print("Host: ");
                    String host = scanner.nextLine();
                    Podcast podcast = new Podcast(titulo, duracao, host);
                    System.out.print("Deseja adicionar convidados? (s/n): ");
                    if (scanner.nextLine().equalsIgnoreCase("s")) {
                        System.out.print("Convidados (separados por vírgula): ");
                        String[] convidados = scanner.nextLine().split(",");
                        for (String convidado : convidados) {
                            podcast.addConvidado(convidado.trim());
                        }
                    }
                    biblioteca.add(podcast);
                    System.out.println("Podcast adicionada com sucesso!");
                }
                case 3 -> {
                    System.out.print("Digite o título do áudio para curtir: ");
                    String titulo = scanner.nextLine();
                    Audio audio = encontrarAudioPorTitulo(biblioteca, titulo);
                    if (audio != null) {
                        audio.curtirAudio();
                        System.out.println("Você curtiu o áudio: " + titulo);
                    } else {
                        System.out.println("Áudio não encontrado.");
                    }
                }
                case 4 -> {
                    System.out.print("Digite o título do áudio para reproduzir: ");
                    String titulo = scanner.nextLine();
                    Audio audio = encontrarAudioPorTitulo(biblioteca, titulo);
                    if (audio != null) {
                        audio.reproduzAudio();
                        System.out.println("Você reproduziu o áudio: " + titulo);
                    } else {
                        System.out.println("Áudio não encontrado.");
                    }
                }
                case 5 -> {
                    if (biblioteca.isEmpty()) {
                        System.out.println("Nenhum áudio cadastrado.");
                    } else {
                        System.out.println("### Lista de Áudios ###");
                        for (Audio audio : biblioteca) {
                            audio.informacaoAudio();
                            System.out.println("---------------------");
                        }
                    }
                }
                case 6 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

    }

    private static Audio encontrarAudioPorTitulo(List<Audio> biblioteca, String titulo) {
        for (Audio audio : biblioteca) {
            if (audio.getTitulo().equalsIgnoreCase(titulo)) {
                return audio;
            }
        }
        return null;
    }
}
