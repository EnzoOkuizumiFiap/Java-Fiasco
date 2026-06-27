package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /* #P47 27 Queue - Estrutura de Dados */
        // QUEUE - FILAS

        // Queues são inverso da Stack (Pilha)!! Característica de Primeiro Entra Primeiro Sai!!
        // FIFO - First In First Out
        Queue<String> ninjasQueue = new LinkedList<>(); // LinkedList - Listas Encadeadas

        // Adicionar na Queue
        ninjasQueue.add("Naruto Uzumaki"); // No caso, o Naruto seria o HEAD!! Cabeça
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Tobirama Senju"); // E o Tobirama seria o TAIL!! Rabo (KKKKKK)
        System.out.println("Ninjas na Fila: " + ninjasQueue);

        // Printar um específico da Queue
        LinkedList<String> ninjasList = new LinkedList<>(ninjasQueue);
        System.out.println("Pegando o segundo ninja: " + ninjasList.get(1));

        // Remover um ninja da Queue Fila - Vai remover o HEAD da Fila
        System.out.println("Removendo o primeiro Ninja: " +  ninjasQueue.poll());
        System.out.println("Depois do Poll: " + ninjasQueue);

        // Como ver o primeiro HEAD da Queue
        System.out.println("Pegando o Primero HEAD: " + ninjasQueue.peek());

        // Adicionar depois na Queue
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas na fila: " + ninjasQueue);

        // Deletar o Tail - TOMANDO NO CU!! Não dá!! Você teria que remover os anteriores antes de conseguir deletar o último!!


        // Esvaziar Fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        System.out.println("Nenhum Ninja na Fila: " + ninjasQueue);

        // Verificar se está vazia a fila
        if(ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia!");
        }


        /* #P49 29 LinkedList X ArrayList */
        // Qual a diferença de uma lista encadeada, linkedList para um Array List??

        /* Array List é excelente para procurar coisas, pois possui index, porém é horrível quando se precisa fazer um grande número de operações. Por que o algoritmo não fica performático!
        *
        * Ex: Em um Array List temos Naruto (index 0), Sasuke (index 1), Sakura (index 2)
        *
        * Agora queremos mudar e add a Hinata no lugar do Sasuke!!
        *
        * Ao fazer isso vamos precisar REORDENAR TODOS DA LISTA: Sasuke e Sakura e os seus índices!!
        * Naruto (index 0), Hinata (index 1), Sasuke (index 2), Sakura (index 3)
        *
        * Isso funciona bem em uma lista pequena!! Entretanto, se for em um Array Lista de 1 bilhão de elementos??
        * Com certeza vamos ter gargalo na memória e performance!! Vamos precisar 1 bilhão de elementos e indexes TT
        * */


        /* O LinkedList (Lista Encadeada) é solução para os ArrayList!!! Ele é muito mais performático!!
        *
        * Entretanto para encontrar algo em uma linkedinList é PÉSSIMO!! Mas fazer operações e mover afins é MUITO MAIS FÁCIL!!
        *
        * */
    }
}
