package NivelIntermediario.FinalClass;

// Chamamos isso de Super Classe, pois alguém estende ela!
public abstract class Ninja implements EstrategiaDeBatalha {
    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Ranks: Gennin, Chunin, Jounnin, Hokage

    public String nome;
    public String aldeia;
    public int idade;
    public int numeroDeMissoesConcluidas;
    public NivelNinja rank;

    // O final é basicamente uma constante igual em JS
    final double altura = 1.75;


    // Construtores
    public Ninja() {}

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE
    // Não pode ser sobrescritos e o valor é PERMANENTE!
    final void tacarKunai() {
        System.out.println("EU SOU UM MÉTODO DA CLASSE MÃE!");
    }

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
    @Override // Colocamos @Override mesmo sem precisar, pois é uma convenção!
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é " + nome + ". Essa é a minha ESTRATÉGIA de batalha");
    }

    // Inteligencia de Combate - Metodo padrão
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGÊNCIA de combate");
    }

    // Inteligencia de Combate com QI - Sobrecarga de metodos
    public void inteligenciaDeCombate(int qi){
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + " e você é um Gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + " e você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é " + qi + " e você precisa treinar mais suas estratégias.");
        }
    }
}
