package atividade2;

import java.util.Scanner;

public class Atividade2_Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0, result;
        int operacao;

        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Sair");

        operacao = scanner.nextInt();

        if (operacao >= 1 && operacao <= 4) {
            System.out.print("Digite o primeiro numero: ");
            num1 = scanner.nextInt();

            System.out.print("Digite o segundo numero: ");
            num2 = scanner.nextInt();
        }

        switch (operacao) {
            case 1:
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Resultado: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Nao e possivel dividir por zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                }
                break;

            case 5:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Operacao invalida.");
        }
    }
}