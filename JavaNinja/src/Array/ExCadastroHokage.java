package Array;

import java.util.Scanner;

public class ExCadastroHokage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int NUMERO_MAX = 5;
        String[] ninjas = new  String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            // Cadastrar os ninjas em um array e depois mostrar opções com Switch Cases
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para Cadastro: ");
                        String nomeNinja = scan.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrada com sucesso!");
                    } else {
                        System.out.println("A lista de ninjas está cheia");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja foi encontrado!");
                    } else {
                        System.out.println("============= Lista de Ninjas =============");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Estamos terminando o programa... Aguarde");
                    break;

                default:
                    System.out.println("Essa opção não é válida!");
                    break;
            }
        }



    }
}
