package NivelIntermediario.SobrecargaMetodos;

public class Main {
    public static void main(String[] args) {
        /* #P32 14 Overload - Sobrecarga de metodos */

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 50, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();

        // Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 5, NivelNinja.CHUUNIN);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

        // Metodo comum
        madara.inteligenciaDeCombate();
        // Metodo Sobrecarregado
        madara.inteligenciaDeCombate(180);
    }
}
