package Condicoes;

public class IfElse {
    public static void main(String[] args) {
        //If e Else - Condições
        // Objetivo: Passar o ninja de nível de acordo com o número de missões

        //Ninja Naruto
        String nome = "Naruto";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 21;

        if(numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if(numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
    }
}
