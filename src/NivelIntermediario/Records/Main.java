package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {
        /* #P44 24 Records - Um jeito melhor de trabalhar com classes */

        // Usando Class
        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 9999999);
        System.out.println(cadastro);
        System.out.println("Nome do cadastro: " + cadastro.getNome());

        // Usando Record
        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@email.com", 11111);
        System.out.println(cadastroUsandoRecord);
        System.out.println("Email com Caixa Alta Record: " + cadastroUsandoRecord.emailCaixaAlta());
        System.out.println("Nome do Cadastro Record: " + cadastroUsandoRecord.nome());
    }
}
