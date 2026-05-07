package atividade2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Atividade2_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Thiago");

        Collections.sort(nomes);

        do{
            System.out.print("\nDigite a opção desejada: \n");
            System.out.println("1 - Adicionar nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Buscar nome");
            System.out.println("4 - Listar nomes");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Digite o nome a ser adicionado: ");
                    String adicionarNome = sc.next();
                    nomes.add(adicionarNome);
                    System.out.println("Nome adicionado!\n");
                    break;

                case 2:
                    System.out.println("Digite o nome a ser removido: ");
                    String removerNome = sc.next();
                    if (nomes.remove(removerNome)){
                        System.out.println("Nome removido!\n");
                    } else {
                        System.out.println("Nome não encontrado!\n");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome a ser buscado: ");
                    String buscarNome = sc.next();
                    if (nomes.contains(buscarNome)){
                        System.out.println("Nome encontrado!\n");
                    } else {
                        System.out.println("Nome não encontrado!\n");
                    }
                    break;

                case 4:
                    System.out.println("Nomes cadastrados:");
                    for (String nome : nomes) {
                        System.out.println("- " + nome);
                    }
                    break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }

        } while (opcao != 0);
            sc.close();
    }
}
