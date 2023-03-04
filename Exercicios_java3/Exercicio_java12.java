package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Matriz = new int[20];
        int maior = Matriz[0], menor = Integer.MAX_VALUE;

        for (int i = 0; i < 20; i++) {

                System.out.println("Informe um valor para temperatura " + (i + 1) + " em ºC: ");
                Matriz[i] = input.nextInt();
            if (Matriz[i] > maior) {
                maior = Matriz[i];

            }
        }
        for (int j = 0; j < 20; j++) {
            if(Matriz[j] < menor){
                menor = Matriz[j];
            }
        }

        System.out.print("A maior temperatura lida foi:" + maior +". A menor temperatura lida foi: "+ menor);
        System.out.println("Drcosmic51");
    }
}
