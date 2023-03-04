package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Insira o Valor ");
        int N = input.nextInt();

        if (N < 0) {
            N = N * (-1);

        }
        System.out.println ("O número transformado em positivo é:" + (N));

        input.close();
        System.out.println("Drcosmic51");

    }
}
