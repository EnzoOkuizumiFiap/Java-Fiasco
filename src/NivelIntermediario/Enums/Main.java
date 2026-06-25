package NivelIntermediario.Enums;

public class Main {
    public static void main(String[] args) {
        /* #P40 21 ENUMS - Uma classe especial, mas nem tanto */

        Missoes missao1 = new Missoes(RankDeMissoes.D, "Resgatar cachorro");
        missao1.exibiDetalhes();

        Missoes missao2 = new Missoes(RankDeMissoes.A, "Derrotar Zabusa");
        missao2.exibiDetalhes();
    }
}
