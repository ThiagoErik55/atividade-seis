package atividade1;
import java.util.Arrays;

public class Atividade1_Ex3 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            numeros[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(numeros);

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}