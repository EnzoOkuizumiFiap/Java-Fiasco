package NivelIntermediario.Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    //Construtor vazio - sem argumentos
    public Hokages() {}

    // Criando um construtor com argumentos
    public Hokages(String nome) {
        //this.nome -> referenciando o atributo lá encima
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    // All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        //this. -> referenciando o atributo lá encima
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

}
