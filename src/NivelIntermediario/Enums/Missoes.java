package NivelIntermediario.Enums;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    // Metodo para mostrar mais infos
    public void exibiDetalhes() {
        System.out.println("Missão: " + nome + " Rank: " + rank + " (Descrição: " + rank.getDescricao() + ", Dificuldade: " + rank.getDificuldade() + ")");
    }

    public Missoes(RankDeMissoes rank, String nome) {
        this.rank = rank;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
