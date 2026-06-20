package NivelIntermediario.HerancaMultipla;

// Chamamos isso de Super Classe, pois alguém estende ela!
public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Construtores
    public Ninja() {}

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
}
