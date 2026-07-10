package NivelAvancado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* #P61 6 Streams - Melhor feature do Java */

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 47));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 9));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 28));
        ninjas.add(new Ninja("Temari", "Suna", 39));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 57));

        // FILTER - Filtragem dos ninjas por vilas usando .stream
        System.out.println("Filtragem por aldeia");
        ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Konoha")) // Usa uma função lambda para verificar se o ninja pertence à vila "Konoha"
                .forEach(System.out::println); // Exibe cada ninja filtrado no console

        // SORTED - Ordenação de ninjas por idade
        System.out.println("\nOrdenando por idade");
        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        // SORTED - Ordenação de ninjas por nome
        System.out.println("\nOrdenando por nome");
        ninjas.stream()
                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
                .forEach(System.out::println);

        // MAP - mostrar e mapear um atributo
        System.out.println("\nMapear por nome");
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        // MAP - mapear somente idade
        System.out.println("\nMapear por idade");
        ninjas.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);

        // MAX - Filtrar por ninja mais velho (max usa optional)
        System.out.println("\nFiltrar por mais velho");
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("Ninja filtrado pelo mais velho = " + ninjaMaisVelho);

    }
}
