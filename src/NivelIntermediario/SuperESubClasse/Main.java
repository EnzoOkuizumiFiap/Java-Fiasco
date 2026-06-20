package NivelIntermediario.SuperESubClasse;

public class Main {
    public static void main(String[] args) {
        /* #P29 11 Super Classes X Sub Classes - É raro, mas acontece muito */

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();
    }
}
