package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /* #P45 25 Stack - O último a entrar e o primeiro a sair */

        // Array - são estáticos e tem referência de memória prévia (Quanto espaço de mem vamos usar)
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        System.out.println("ninjasArray: " + Arrays.toString(ninjasArray));

        // Listas - são dinâmicas e tamanho aumento ou diminui conforme necessário
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        System.out.println("ninjasList: " + ninjasList);

        System.out.println("\n========= Stack =========");

        // Stack - O último elemento que ENTROU é obrigatoriamente o primeiro a SAIR.
        // Trabalhamos com a Stack de forma Vertical...
        // FILO - First In Last Out
        Stack<String> ninjasStack = new Stack<>();

        // Adicionar elementos da pilha - push()
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");
        ninjasStack.push("Hinata Hyuga");
        ninjasStack.push("Kakashi Hatake");
        System.out.println("Minha Stack Atual: " + ninjasStack);

        // Tirar o último Elemento da pilha - pop()
        ninjasStack.pop();
        System.out.println("Minha Stack com Pop(): " + ninjasStack);

        // Verificar qual o próximo Elemento da pilha - peek()
        System.out.println("Minha Stack com peek(): " + ninjasStack.peek());

        // Verificar o tamanho da pilha Quant de Elementos - size()
        System.out.println("Minha Stack com size(): " + ninjasStack.size() + " elementos");
        System.out.println("Minha Stack Final: " + ninjasStack);
    }
}
