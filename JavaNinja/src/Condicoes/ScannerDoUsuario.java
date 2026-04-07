package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do Ninja: ");
        String nomeDoNinja = scan.nextLine();
        System.out.println("O nome do Ninja é " + nomeDoNinja);

        System.out.println("Digite o idade: ");
        int idadeDoNinja = scan.nextInt();
        System.out.println("A idade do Ninja é " + idadeDoNinja + " anos.");

        //Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir em missões fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }

        scan.close();
    }
}
