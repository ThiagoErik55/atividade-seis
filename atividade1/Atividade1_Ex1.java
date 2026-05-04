import java.util.Scanner;

public class Atividade1_Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0; 
        int maior = 0, menor = 0; 

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um numero inteiro: ");
            num = sc.nextInt();

            soma += num;

            if(i == 1){
                maior = num;
                menor = num;
            } else {
                if(num > maior){
                    maior = num;
                }
                if(num < menor){
                    menor = num;
                }
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma / 5));
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}