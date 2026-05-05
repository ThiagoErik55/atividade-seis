package atividade2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Atividade2_Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Thiago");

        Collections.sort(nomes);

        for(String n : nomes) {
            System.out.println(nome);
        }
    }
}
