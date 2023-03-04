package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Entre com o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Entre com o valor de C: ");
        double c = input.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há solução real para delta < 0");

        } else if (delta == 0) {
            double x = -b / (2 * a);

            System.out.printf("Delta = 0, há apenas uma solução real: x = %.2f", x);

        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("Delta > 0, há duas soluções reais diferentes: x1 = %.2f e x2 = %.2f", x1, x2);

        }

        input.close();

    }
}
