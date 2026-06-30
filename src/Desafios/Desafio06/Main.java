package Desafios.Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /* #P52 31 Desafio 06 - Lista encadeada de ninjas */

        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));
        //System.out.println("Lista de Ninjas: " + listaDeNinjas);

        System.out.println("============== Lista de Ninjas ==============");
        // Complexidade o(n) no for
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));
        System.out.println(listaDeNinjas);

        System.out.println("\n================== Ninja Removido ==================");

        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        System.out.println("\n================== Mudanças ==================");

        for (Ninja listaDeNinjaAtualizada : listaDeNinjas) {
            System.out.println("Lista de Ninja depois das mudanças: " + listaDeNinjaAtualizada);
        }

        System.out.println("\n================== Ninja Específico ==================");
        Ninja terceiroNinja = listaDeNinjas.get(3);
        System.out.println("Terceiro ninja: " + terceiroNinja);

    }
}
