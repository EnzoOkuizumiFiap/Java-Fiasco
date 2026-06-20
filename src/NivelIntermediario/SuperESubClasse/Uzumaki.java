package NivelIntermediario.SuperESubClasse;

// Chamamos isso de Sub Classe
public class Uzumaki extends Ninja {

    @Override // Sobrescrevendo metodo da classe Ninja - polimorfismo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de Ar.");
    }
}
