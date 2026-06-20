package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {
    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void boasVindas() {
        System.out.println(nome + ": Eu sou um Hatake");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da Anbu!");
    }

    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage!");
    }

    public void sharinganAtivado() {
        System.out.println( nome + ": Ativou o Sharingan");
    }
}
