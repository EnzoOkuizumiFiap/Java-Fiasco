package TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados não primitivos: String, Array, Class, enum
         */
        String nome = "Naruto";
        String nomeUpperCase = nome.toUpperCase(); //Colocar tudo em CAIXA ALTA
        System.out.printf("Esse texto está em caixa baixa: %s%n",nome);
        System.out.printf("Esse texto está em CAIXA ALTA: %s%n", nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeia);
        System.out.println(aldeiaLowerCase);
    }
}
