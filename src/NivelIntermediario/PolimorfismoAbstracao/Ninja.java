package NivelIntermediario.PolimorfismoAbstracao;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    // Metodo Geral!! Todos os ninjas vão ter!!
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque especial é lançar kunais.");
    }

    // Sobrescrevendo metodo da Interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Meu nome é " + nome + " e essa é a minha estratégia de batalha");
    }
}
