package NivelIntermediario.ComplexidadeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /* #P58 03 - Complexidade de algoritmos */

        long inicio;
        long fim;
        long tempo;

        // Classificação O(n) - Complexidade Linear
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Classificação O(1) - Complexidade Constante
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Classicação O(n) - Complexidade Linear
        // Classificação O(n²) caso seja um For dentro de outro For!! É um nested loop (loop aninhado)
        for (int i = 0; i < 22090500; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        System.out.println("============ Verificando Tempo Get Elemento ============");
        inicio = System.nanoTime();
        arrayList.get(250);
        fim = System.nanoTime();

        tempo = fim - inicio;
        System.out.println("Tempo Array List: " + tempo + " nanoseconds");


        inicio = System.nanoTime();
        linkedList.get(250);
        fim = System.nanoTime();

        tempo = fim - inicio;
        System.out.println("Tempo Linked List: " + tempo + " nanoseconds");


        System.out.println("\n============ Verificando Tempo Add Elemento ============");
        inicio = System.nanoTime();
        arrayList.add(250);
        fim = System.nanoTime();

        tempo = fim - inicio;
        System.out.println("Tempo Array List: " + tempo + " nanoseconds");

        inicio = System.nanoTime();
        linkedList.add(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + " nanoseconds");


        System.out.println("\n============ Verificando Tempo Remove Elemento ============");
        inicio = System.nanoTime();
        arrayList.remove(250);
        fim = System.nanoTime();

        tempo = fim - inicio;
        System.out.println("Tempo Array List: " + tempo + " nanoseconds");

        inicio = System.nanoTime();
        linkedList.remove(250);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + " nanoseconds");


        // Isso é um algoritmo, é um O(1) - Constante
        int a = 1;
        int b = 1;
        int solucao = a + b;

        // Ainda continua sendo um 0(1) - Constante:
        int solucaoMultiplicacao = (a + b) * 500;
    }
}
