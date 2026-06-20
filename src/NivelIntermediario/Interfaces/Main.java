package NivelIntermediario.Interfaces;

public class Main {
    public static void main(String[] args) {
        /* #P23 05 Interfaces - Uma Explicação Simples */

        // Criando Naruto Uzumaki - Objeto 01
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Apaguei os outros Objetos

        //Criando Hinata Hyuga - Objeto 04
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();

        // Criando Boruto Uzumaki - Objeto 05
        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();

    }
}
