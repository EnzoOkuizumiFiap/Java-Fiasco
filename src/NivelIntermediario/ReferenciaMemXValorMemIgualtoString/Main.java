package NivelIntermediario.ReferenciaMemXValorMemIgualtoString;

public class Main {
    public static void main(String[] args) {
        /* #P34 16 Referência de Memória X Valor em Memória = toString */

        // Obj uzumaki
        System.out.println("-------------- Naruto Uzumaki --------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 50, NivelNinja.GENIN);
        System.out.println(naruto);

        // Obj uchiha
        System.out.println("-------------- Sasuke Uchiha ---------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        System.out.println(sasuke);

    }
}
