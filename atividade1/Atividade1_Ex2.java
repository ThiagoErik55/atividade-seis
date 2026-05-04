package atividade1;
import java.util.Scanner;

public class Atividade1_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int par = 0, impar = 0;

        while(true){
            System.out.println("Digite um numero inteiro (0 para sair): ");

            num = sc.nextInt();

            if(num == 0){
                break;
            }

            if (num %2 == 0){
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros impares: " + impar);
    }
}