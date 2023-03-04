package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java4 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("insira o valor maior");
        double a = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("insira o valor menor");
        double b = input2.nextInt();

        double d = (a - b);
        System.out.println("A diferença entre o maior e menor valor é" + d);

        input1.close();
        input2.close();
        System.out.println("Drcosmic51");
    }
}
