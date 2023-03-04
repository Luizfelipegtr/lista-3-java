package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] M = new int[12];
        for (int i = 0; i < M.length; i++) {
            System.out.println("Informe o valor do número " + (i + 1) + ": ");
            M[i] = input.nextInt();
        }
        for (int j : M) {
            System.out.print(j + ", ");
        }
        System.out.println("Drcosmic51");
    }
}
