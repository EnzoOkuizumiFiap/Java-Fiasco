package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {
        /* #P22 04 Herança - O primeiro pilar da Orientação a Objeto */

        // Criando Naruto Uzumaki - Objeto 01
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        //Criar ninja Sasuke Uchiha - Objeto 02
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        // Usando herança: criamos um objeto da classe Uchiha, que herda atributos e métodos da classe Ninja.
        Sasuke.SharinganAtivado();

        //Criando Sakura Haruno - Objeto 03
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Uchiha";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 19;
        Sakura.AtivarCura();

        //Criando Hinata Hyuga - Objeto 04
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();

    }
}
