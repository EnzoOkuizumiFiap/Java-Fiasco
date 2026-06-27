package NivelIntermediario.Records;

public record NinjaRecord(String nome, String email, int telefone) {

    // Todos os atributos são FINAL por padrão, não podemos alterar depois!
    // Records não tem SETTER, não podemos alterar um valor depois de definido!!

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }

}
