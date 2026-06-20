package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {
        /* #P25 07 Construtores - Organizando e Padronizando os Objetos */

        Hokages Hashimara = new Hokages();
        Hashimara.idade = 45;
        System.out.println("Sem usar construtor: " + Hashimara.idade);

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println("Construtor Nome: " + Tobirama.nome);

        Hokages Hiruzen = new Hokages(40);
        System.out.println("Construtor Idade: " + Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println("All args constructor: Nome: " + Minato.nome + ". Idade: " +  Minato.idade + ". Vivo ou Não: " + Minato.vivoOuNao);
    }
}
