package NivelIntermediario.ClassesAbstratas;

/**
 * Regras classes abstratas (Super Classe):
 * 1 - Não podem ser instanciadas
 * 2 - Métodos Abstratos não podem ter corpo
 * 3 - Modificadores de acesso, mas NUNCA private, pois subclasses precisam sobrescrever
 * 4 - Métodos Concretos são permitidos, diferente de uma Interface
 * 5 - Podem Herdar de outra Classe Abstrata
 * 6 - Podem implementar Interfaces
 */

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    // Metodo Abstrato
    public abstract void sabedoriaHokage();

    // Metodo Concreto
    public void ataqueHokage() {
        System.out.println("Ataque Hokage!! Feito por " + nome);
    }

    //Construtor vazio - sem argumentos
    public Hokages() {}

    // All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        //this. -> referenciando o atributo lá encima
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

}
