package NivelIntermediario.HerancaMultipla;

import NivelIntermediario.SuperESubClasse.Uzumaki;

public class Main {
    public static void main(String[] args) {
        /* #P30 12 Herança Múltipla - Como realmente Interfaces funcionam  */

        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        sasuke.sharinganAtivado();

        // Obj Hatake
        Hatake kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha", 48);
        kakashi.boasVindas();
        kakashi.ninjaDeElite();
        kakashi.sharinganAtivado();
        kakashi.hokageAtivo();
    }
}
