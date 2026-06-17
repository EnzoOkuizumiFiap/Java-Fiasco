package Array;

public class Array {
    public static void main(String[] args) {
        /* Vendo sobre Arrays -> Tipo referência, são fixos e é diferente de LISTA (que é dinâmica) */

        String[] ninja = new String[6];

        ninja[0] = "Naruto";
        ninja[1] = "Sakura";
        ninja[2] = "Uchiha";
        ninja[3] = "Hinata";
        ninja[4] = "Kakashi";
        System.out.println(ninja[2]);

        /* Java vai apagar o Array antigo - Garbage Collector */
        ninja = new String[7];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";
        System.out.println(ninja[2]);

        // Usando o For para percorrer o Array
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);
        }


        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

    }
}
