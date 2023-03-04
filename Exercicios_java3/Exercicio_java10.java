package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
           System.out.println("digite o nome " + (i + i) + ": ");
           nomes[i] = input.nextLine();


        }System.out.println("Nomes colocados: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(nomes[i]);
        }
        System.out.println("Drcosmic51");


    }
}
