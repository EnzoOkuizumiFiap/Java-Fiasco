package NivelIntermediario.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* #P50 30 LinkedList - Introdução a Collection */

        LinkedList<String> ninjas = new LinkedList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        System.out.println(ninjas);

         ninjas.add(1, "Kakashi Hatake");
        System.out.println(ninjas);

        ninjas.remove(2);
        System.out.println(ninjas);

        // Em uma LinkedList, NÃO temos um Index, então procurar um elemento fica mais difícil!!
        // Entretanto, cada Elemento vai estar apontando para o próximo Elemento!!

        /* Exemplo:
            Temos Naruto, Sasuke e Sakura.

            -Naruto aponta para Sassuke
            -Sasuke aponta para Sakura
            -Sakura aponta pra ninguém!

            Agora queremos adicionar o Kakashi depois do Naruto:
            Simples, só colocamos para mudar os ponteiros!!

            -Naruto aponta para Kakashi
            -Kakashi aponta para Sasuke
            -Sasuke aponta para Sakura
            -Sakura aponta pra ninguém!

            Com isso, não precisamos reordenar uma lista INTEIRA, apenas mudar os ponteiros!

            E também não precisam fazer parte do mesmo grupo de memória!
             Exemplo: Naruto tem referência de Memória @101 e Kakashi tem Ref de Mem @403
             Diferente dos ArrayList, que são sequências, os LinkedList não são e trabalham com ponteiros!
       */


        /* Agora vamos ver sobre Collections!! */
        /* Estrutura de Dados: ArrayList, Stack, Queue, LinkedList */
        System.out.println("\nVendo sobre Collection");

        // Eles são classes que implementam a Interface List que por sua vez estendem a Collection:
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        // As Interfaces Queues implementam as Collections e as PriorityQueue são Classes que estendem Queue que por sua vez estendem a Queue
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto");
        System.out.println(linkedList);



        /* #P49 29 LinkedList X ArrayList */
        // Qual a diferença de uma lista encadeada, linkedList para um Array List??

        /* Array List é excelente para procurar coisas, pois possui index, porém é horrível quando se precisa fazer um grande número de operações. Por que o algoritmo não fica performático!
         *
         * Ex: Em um Array List temos Naruto (index 0), Sasuke (index 1), Sakura (index 2)
         *
         * Agora queremos mudar e add a Hinata no lugar do Sasuke!!
         *
         * Ao fazer isso vamos precisar REORDENAR TODOS DA LISTA: Movendo Sasuke e Sakura para a direita e os seus índices!!
         * Naruto (index 0), Hinata (index 1), Sasuke (index 2), Sakura (index 3)
         *
         * Isso funciona bem em uma lista pequena!! Entretanto, se for em um Array Lista de 1 bilhão de elementos??
         * Com certeza vamos ter gargalo na memória e performance!! Vamos precisar 1 bilhão de elementos e indexes TT
         */


        /* O LinkedList (Lista Encadeada) é solução para os ArrayList!!! Ele é muito mais performático!!
         *
         * Entretanto para encontrar algo em uma linkedinList é PÉSSIMO!! Mas fazer operações e mover afins é MUITO MAIS FÁCIL!!
         *
         */
    }
}
