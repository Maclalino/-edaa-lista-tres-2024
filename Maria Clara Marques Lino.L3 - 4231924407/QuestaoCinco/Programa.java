package QuestaoCinco;
import java.util.Scanner;

public class Programa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        char[] caracteres = input.toCharArray();

        quickSort(caracteres, 0, caracteres.length - 1);

        
        System.out.print("String ordenada: ");
        for (char c : caracteres) {
            System.out.print(c);
        }

        scanner.close();

    }

    public static void quickSort(char[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(arr, inicio, fim);
            quickSort(arr, inicio, indicePivo - 1);
            quickSort(arr, indicePivo + 1, fim);
        }
    }

    public static int particionar(char[] arr, int inicio, int fim) {
        char pivo = arr[fim];
        int indicePivo = inicio;

        for (int i = inicio; i < fim; i++) {
            if (arr[i] < pivo) {
                // Troca de elementos
                char temp = arr[i];
                arr[i] = arr[indicePivo];
                arr[indicePivo] = temp;
                indicePivo++;
            }
           

        }

        char temp = arr[indicePivo];
        arr[indicePivo] = arr[fim];
        arr[fim] = temp;

        return indicePivo;

       
    }
}
