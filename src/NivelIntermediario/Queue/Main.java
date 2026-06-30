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
    }
}
