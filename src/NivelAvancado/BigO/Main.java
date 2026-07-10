package NivelAvancado.BigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* #P59 04 Introdução a BigO Notation */
        // BigO é saber metrificar o seu algoritmo!!

        // O que é um algoritmo?? Algoritmo é tudo que fazemos na programação!!
        int a = 1;
        int b = 2;
        int c = 3;

        int resultado = (a * c) - (b - c);
        System.out.println("resultado dos cálculos: " + resultado);

        // Estrutura de Dados: Array, ArrayList, Stack, Queue, Linked List e afins! As estruturas de dados servem para implementar Algoritmos!!

        // Exemplo!! ArrayList - lista sequencial numérica... Complexidade constante - O(1)

        // Ele nunca vai depender tamanho da lista!
        // O(1) - complexidade Constante é o ideal, pois nunca muda...
        ArrayList<Ninjas> ninjas = new ArrayList<Ninjas>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 17));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        System.out.println(ninjas.get(2));


        // Algoritmo - O(n) Complexidade Linear - Vai depender do tamanho da lista
        System.out.println("\nTestando O(N)");
        // Em um For a gente sempre vai percorrer a lista inteira! E vai aumentar com o tempo!

        /*
        for (Ninjas ninja : ninjas) {
            System.out.println(ninja);
        }
        */


        // O(N^2) - Complexidade Quadrática - Mais comuns...
        // Vamos piorar usando complexidade Quadrática!! E se colocarmos um For dentro de outro For?? Nested Loop (loop encadeado) E agora vamos ter 2 ponteiros!!
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + " contra " + ninjas.get(j));
            }
        }


        /* #P60 5 BigO - Não é sobre Complexidade APENAS, por favor entenda isso! */

        // BigO não é sobre medir COMPLEXIDADE DE ALGORITMO, mas sim ESCALABILIDADE dos seus algoritmos!!

        // Temos 2 parâmetros para medir BigO - Complexidade Temporal e Espacial


        // Complexidade Espacial leva em consideração a memória / uso da memória para aquele algoritmo performar

        // Complexidade Temporal já é mais sobre o tamanho do algoritmo / quanto ele vai escalar


    }
}
