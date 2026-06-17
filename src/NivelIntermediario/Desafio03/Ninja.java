package NivelIntermediario.Desafio02;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes() {
        System.out.printf("\nSuas infos são:%n Nome: %s Idade: %d%n Missão: %s%n Nivel Dificuldade: %s%n Status Missão: %s%n", nome, idade, missao, nivelDificuldade, statusMissao);
    }
}
