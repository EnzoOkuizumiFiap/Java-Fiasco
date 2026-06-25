package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* P41 22 List - Um array com super poderes */

        // Array - são estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Referência da Mem do Array: " + ninjasArray);
        System.out.println("Printando um índice do Array: " + ninjasArray[1]);

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("ninjasArray[" + i + "]: " + ninjasArray[i]);
        }


        // Listas - não são estáticas, podem aumentar ou diminuir de tamanho
        List<String> ninjasList = new ArrayList<>();
        System.out.println("\nPrintando List após criada: " + ninjasList);

        ninjasList.add("Naruto Uzumaki"); // Index 0
        ninjasList.add("Sasuke Uchiha"); // Index 1
        ninjasList.add("Sakura Haruno"); // Index 2
        ninjasList.add("Tobirama Senju"); // Index 3

        // Adicionando da lista
        ninjasList.add("Kakashi Hatake"); // Index 4
        System.out.println("Printando ninjaList: " + ninjasList);

        // Removendo da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("Printando ninjaList (sem Kakashi): " + ninjasList);

        // Trocar elemento da lista
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("Printando ninjaList (trocando p/ Hashirama): " + ninjasList);

        // Tamanho da lista
        System.out.println("\nTamanho da lista: " + ninjasList.size() + " elementos.");


    }
}
