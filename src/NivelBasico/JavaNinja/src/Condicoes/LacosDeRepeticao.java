package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /* Laços de Repetição -> Vão repetir infinitamente ou até você atingir o parâmetro desejado */

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        // While
        while(numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras. Número de Clones: " + numeroDeClones);
        }

        // For
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto fez um clone das sombras. Número de Clones: " + i);
        }

    }
}
