package NivelIntermediario.FinalClass;

public class Main {
    public static void main(String[] args) {
        /* #P36 18 Final Class - Deixando as CLASSES constantes */

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 50, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        System.out.println("---------------------");
        naruto.tacarKunai();
        System.out.println("Altura:" + naruto.altura);
        System.out.println("---------------------");

        // Obj Ninja Anbu
        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Anbu";
        ninjaAnbu.anbu();
    }
}
