package NivelIntermediario.PolimorfismoAbstracao;

public class Uchiha extends Ninja {

    public void estrategiaDeBatalhaNinja(){
        System.out.println("ESsa é a minha estratégia de Batalha!");
    }

    @Override // Sobrescrevendo um metodo da classe Ninja - polimorfismo
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de Fogo.");
    }
}
