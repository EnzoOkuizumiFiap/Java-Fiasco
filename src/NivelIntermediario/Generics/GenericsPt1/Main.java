package NivelIntermediario.Generics.GenericsPt1;

public class Main {
    public static void main(String[] args) {
        /* #P42 23 Generics - Uma explicação simples, mas nem tanto [Parte 1] */

        // Iniciando o novo objeto / Instanciando...
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de Ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        // Bolsa Genérica - iniciando o novo objeto / Instanciando...
        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();

        // Adicionando Equipamentos na bolsaGenerica
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);



    }
}
