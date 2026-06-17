package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scan.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma reposta válida! Tente de novo ");

        }

        scan.close();
    }
}
