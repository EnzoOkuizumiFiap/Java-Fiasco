package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        /* #P24 06 Polimorfismo - O segundo pilar da Orientação a Objeto */

        // Obj Ninja
        Ninja ninja = new Ninja();
        ninja.nome = "Ninja Qualquer";
        ninja.idade = 10;
        ninja.aldeia = "Aldeia Qualquer";
        ninja.habilidadeEspecial();

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";
        // vv Metodo sobrescrito vv
        naruto.habilidadeEspecial();

        // Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";
        // vv Metodo sobrescrito vv
        sasuke.habilidadeEspecial();
    }
}
