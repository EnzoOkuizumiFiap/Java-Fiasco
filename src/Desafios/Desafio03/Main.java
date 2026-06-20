package Desafios.Desafio03;

public class Main {
    public static void main(String[] args) {
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 15;
        Naruto.missao = "Pegar amuleto raro";
        Naruto.nivelDificuldade = "Fácil";
        Naruto.statusMissao = "Feita";
        Naruto.mostrarInformacoes();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 19;
        Sasuke.missao = "Recuperar amuleto";
        Sasuke.nivelDificuldade = "Média";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.habilidadeEspecial = "Cortar Vento";
        Sasuke.mostrarInformacoes();

        Sasuke.mostrarHabilidadeEspecial();

    }
}
