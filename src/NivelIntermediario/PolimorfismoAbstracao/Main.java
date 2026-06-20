package NivelIntermediario.PolimorfismoAbstracao;

public class Main {
    public static void main(String[] args) {
        /* #P28 10 Polimorfismo + Abstração */

        // Obj Ninja - Colocamos Ninja como Abstrato
        // Então não podemos criar um Ninja Genérico
        /*
        Ninja ninja = new Ninja();
        ninja.nome = "Ninja Qualquer";
        ninja.idade = 10;
        ninja.aldeia = "Aldeia Qualquer";
        ninja.habilidadeEspecial();
        */

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;
        // vv Metodo sobrescrito vv
        naruto.habilidadeEspecial();
        // vv Metodo sobrescrito de Ninja (contrato definido pela interface) vv
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        // vv Metodo sobrescrito vv
        sasuke.habilidadeEspecial();
        // vv Metodo sobrescrito de Ninja (contrato definido pela interface) vv
        sasuke.estrategiaDeBatalhaNinja();
    }
}
