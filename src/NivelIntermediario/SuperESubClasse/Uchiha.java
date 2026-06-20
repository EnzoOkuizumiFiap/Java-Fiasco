package NivelIntermediario.SuperESubClasse;

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

    @Override // Sobrescrevendo um metodo da classe Ninja - polimorfismo
    public void habilidadeEspecial() {
        System.out.println("Esse é meu ataque Uchiha, um ataque de Fogo.");
    }
}
