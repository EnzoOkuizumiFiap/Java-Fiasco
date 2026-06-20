package NivelIntermediario.SuperESubClasse;

// Chamamos isso de Super Classe, pois alguém estende ela!
public abstract class Ninja implements EstrategiaDeBatalha {
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
