package Desafios.Desafio01;

public class NinjaExecute {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();

        ninja.setNome("Naruto");
        ninja.setIdade(14);
        ninja.setMissao("Matar Boss Final");
        ninja.setDificuldade('B');
        ninja.setStatus(true);

        System.out.println("Informações do " + ninja.getNome());
        System.out.println("Idade: " + ninja.getIdade());
        System.out.println("Missão: " + ninja.getMissao());
        System.out.println("Dificuldade: " + ninja.getDificuldade());
        System.out.printf("%s pode fazer a Missão %s com dificuldade %s? Resposta: %n", ninja.getNome(), ninja.getMissao(), ninja.getDificuldade());
        ninja.fazerMissao();
    }
}
