package NivelIntermediario.SobrecargaConstrutores;

// Chamamos isso de Super Classe, pois alguém estende ela!
public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Ranks: Gennin, Chunin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;


    // Construtores
    public Ninja() {}

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do Construtor chamando os novos atributos
    // Sobrecarga de construtores, você não precisa redeclarar o construtor, só os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo Geral!! Todos os ninjas vão ter!!
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque especial é lançar kunais.");
    }

    // Sobrescrevendo metodo da Interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é a minha estratégia de batalha");
    }
}
