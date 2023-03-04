package Exercicios_java3;

import java.util.Scanner;

public class Exercicio_java3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" insira um valor númerico ");
        int nv = input.nextInt();

        int ns = (nv + 1);
        System.out.println(" O número sucessor é " + ns);

        int na = (nv - 1);
        System.out.println(" O número sucessor é " + na);

        input.close();
        System.out.println("Drcosmic51");
    }
}
