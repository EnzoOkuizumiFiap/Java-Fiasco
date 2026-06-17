public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private char dificuldade;
    private boolean status;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String Missao, char dificuldade, boolean status) {
        this.nome = nome;
        this.idade = idade;
        this.missao = Missao;
        this.dificuldade = dificuldade;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public char getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(char dificuldade) {
        this.dificuldade = dificuldade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos
    public boolean verificarIdadeMissao() {
        return idade >= 15 || (dificuldade == 'C' || dificuldade == 'D');
    }

    public void fazerMissao() {
         if(!verificarIdadeMissao()) {
             System.out.println("Você tem menos de 15 anos, você só pode fazer as missões C e D.");
             setStatus(false);
         } else if(!isStatus()){
             System.out.println("Boa sorte na missão!");
             setStatus(true);
         } else {
             System.out.println("Você já concluiu a missão!");
         }
        System.out.println("Status da Missão é: " + (status ? "Concluído!" : "Não Concluída"));
    }
}
