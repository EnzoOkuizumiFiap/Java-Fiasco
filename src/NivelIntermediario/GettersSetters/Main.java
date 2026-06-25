package NivelIntermediario.GettersSetters;

public class Main {
    public static void main(String[] args) {
        /* P39 20 Getters e Setters - Uma explicação mais técnica */

        System.out.println("=========== Naruto ===========");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 30, 1.67);
        System.out.println("Meu nome é " + naruto.getNome());

        // Alterando nome do Naruto via setNome
        naruto.setNome("Naruto Uzumaki com nome alterado");
        System.out.println("Meu nome alterado é " + naruto.getNome());

        System.out.println("=========== Uchiha ===========");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 30, 1.74);
        System.out.println("Meu nome é " + sasuke.getNome());

        // Alterando nome do Sasuke via setNome
        sasuke.setNome("Sasuke Uchiha alterado");
        System.out.println("Meu nome alterado é " + sasuke.getNome());

    }
}
