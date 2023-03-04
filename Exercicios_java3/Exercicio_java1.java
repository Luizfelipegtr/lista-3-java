package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("insira os valores");
        double Celsius = input.nextInt();

        double F = (9 * Celsius + 160) / 5;
        System.out.println("A Temperatura em fahrenheit é " + F);

        input.close();


        System.out.println("Drcosmic51");

    }

}
