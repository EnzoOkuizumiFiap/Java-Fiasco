package NivelIntermediario.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* #P53 32 HashSet - Você vai usar 99% das vezes */

        // Com Listas, ele pode ter valores repetidos:
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Tsunade Senju");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Danzou Shimura");
        ninjas.add("Kakashi Hatake");
        ninjas.add("Boruto Uzumaki");

        System.out.println("Ninjas Lista: " + ninjas);

        // Agora usando HashSet - Ele geralmente vai ser usado quando precisamos que não insira elementos duplicados e NÃO tem uma ordem, NÃO possui Index.
        Set<String> ninjasSet = new HashSet<>();
        /*
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        ninjasSet.add("Sakura Haruno");
        ninjasSet.add("Naruto Uzumaki");
        */

        // Podemos passar uma lista para a estrutura de dados Set
        ninjasSet.addAll(ninjas);

        // E para remover?? Temos que passar o valor que desejamos remover do Set
        ninjasSet.remove("Sakura Haruno");

        System.out.println("Ninjas Set: " + ninjasSet);


        /* #P54 33 LinkedHashSet X TreeSet - Mais algumas implementações */

        // TreeSet - É basicamente um HashSet, mas Implementa em ordem alfabética / númerica
        Set<String> ninjasTreeSet = new TreeSet<>();
        ninjasTreeSet.addAll(ninjas);

        System.out.println("Ninjas TreeSet: " + ninjasTreeSet);


        // LinkedHashSet - É basicamente um HashSet, mas coloca na ORDEM de IMPLEMENTAÇÃO
        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjas);

        System.out.println("Ninjas LinkedHashSet: " + ninjasLinkedHashSet);

        /* AVISO IMPORTANTE:
            Sempre declare usando a interface (Set) e instancie com a implementação (HashSet, TreeSet, LinkedHashSet).
            Isso dá flexibilidade para trocar a implementação sem mudar o resto do código.
            Só use a classe concreta se precisar de métodos específicos dela (ex: TreeSet.first()).
        */
    }
}
