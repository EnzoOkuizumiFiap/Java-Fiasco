package Desafios.Desafio03;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("\nMostrando Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.printf("\nSuas infos são:%n Nome: %s Idade: %d Habilidade Especial: %s%n Missão: %s%n Nivel Dificuldade: %s%n Status Missão: %s%n", nome, idade, habilidadeEspecial, missao, nivelDificuldade, statusMissao);
    }
}
