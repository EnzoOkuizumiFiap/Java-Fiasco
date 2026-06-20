package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    @Override // Sobrescrevendo um metodo da classe Ninja - polimorfismo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de Fogo.");
    }
}
