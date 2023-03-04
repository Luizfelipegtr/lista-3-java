package Exercicios_java3;

public class Exercicio_java11 {
    public static void main(String[] args) {

        int[] a = new int[15];
        int[] b = new int[15];
        int[] c = new int[30];
        System.out.println("valores da a : __ ");
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println("valores: " + a[i]);
        }
        System.out.println("valores da b : __ ");

        for (int i = 0; i < b.length; i++) {
            b[i] = i;
            System.out.println("valores: " + b[i]);
        }
        System.out.println("valores da c : __ ");

        for (int i = 0; i < 15; i++) {
            c[i] = a[i];
            c[i + 15] = b[i];
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("valores: " + c[i]);

        }
    }
}
