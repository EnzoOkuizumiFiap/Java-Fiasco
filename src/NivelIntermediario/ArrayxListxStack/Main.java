package NivelIntermediario.ArrayxListxStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* #P46 26 Array X List X Stack - Um resumão de tudo que vimos */

        // Array - São estáticos, exigem tramanho pré-definido
        String[] nomeNinjaArray = new String[5];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        nomeNinjaArray[3] = "Hinata Hyuga";

        System.out.println("=============== ARRAY ===============");
        System.out.println("Exibindo Array Ref de Memória: " + nomeNinjaArray);
        System.out.println("Exibindo Naruto Uzumaki: " + nomeNinjaArray[0]);
        System.out.println("Exibindo Array Completo: " + Arrays.toString(nomeNinjaArray));

        // List - São Dinâmicas, aumentam ou diminuem de tamanho conforme precisamos
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        nomeNinjaList.add("Hinata Hyuga");

        System.out.println("\n=============== LIST ===============");
        System.out.println("Exibindo Naruto Uzumaki: " + nomeNinjaList.getFirst());
        System.out.println("Exibindo Lista Completo: " + nomeNinjaList);


        // Stack (Pilha) - São únicos, Exigem uma ordem! O último a entrar é o primeiro a sair!
        // FILO - First In Last Out
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");

        System.out.println("\n=============== STACK ===============");
        // Exibindo Stack completa
        System.out.println("Exibindo Stack Completo 1: " + nomeNinjaStack);
        // Removendo último elemento
        System.out.println("Tirar da pilha/stack 1: " + nomeNinjaStack.pop());
        System.out.println("Tirar da pilha/stack 2: " + nomeNinjaStack.pop());
        // Add Kakashi com push e exibindo depois
        nomeNinjaStack.push("Kakashi Hatake");
        System.out.println("Mostrar Stack Completo 2: " + nomeNinjaStack);
        // Mostrando o primeiro da Stack
        System.out.println("Mostrando Ninja no Topo (sem remover): " + nomeNinjaStack.peek());
        System.out.println("Mostrando Stack Completo 3: " +  nomeNinjaStack);
    }
}
