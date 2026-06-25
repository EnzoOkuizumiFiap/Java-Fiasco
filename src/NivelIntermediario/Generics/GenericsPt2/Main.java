package NivelIntermediario.Generics.GenericsPt2;

public class Main {
    public static void main(String[] args) {
        /* #P43 24 Generics - Uma explicação mais complexa [Parte 2] */

        BolsaGenerica<Object> bolsaNinja = new BolsaGenerica<>(); // O Object vem de uma super classe, para conseguirmos trabalhar com diferentes tipos

        bolsaNinja.adicionarFerramentas(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramentas(new Shuriken(3));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocação do sapo"));
        bolsaNinja.adicionarFerramentas(new Pergaminho("Invocação da águia"));
        bolsaNinja.adicionarFerramentas(new CompanheiroNinja("Mamaru"));

        System.out.println("Itens da nossa bolsa Ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
