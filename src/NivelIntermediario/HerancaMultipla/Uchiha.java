package NivelIntermediario.HerancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Esse metodo vem direto da Interface!!
    public void sharinganAtivado() {
        System.out.println( nome + ": Ativou o Sharingan");
    }
}
