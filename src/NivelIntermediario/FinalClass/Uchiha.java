package NivelIntermediario.FinalClass;

// Chamamos isso de Sub Classe
public class Uchiha extends Ninja {

    public Uchiha() {
        // Pegando o Construtor vazio da Super Classe
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        // Pegando o Construtor com argumentos da Super Classe
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override // Sobrescrevendo um metodo da classe Ninja - polimorfismo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + ". Esse é meu ataque Uchiha, um ataque de Fogo. Eu já completei: " + numeroDeMissoesConcluidas + " missões.");
    }

    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + nome + ". Essa é minha INTELIGÊNCIA de combate");
    }

    @Override
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
