package NivelIntermediario.ClassesAbstratasXInterfaces;

// Conseguimos setar valores depois, na interface não!! Pois ela é sempre FINAL
public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Metodo Abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai!");
    }
}
