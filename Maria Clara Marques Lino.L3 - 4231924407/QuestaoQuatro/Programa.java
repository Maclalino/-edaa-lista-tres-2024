package QuestaoQuatro;
import java.util.Scanner;
public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de nomes a serem inseridos: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        
        selectionSort(nomes);

        System.out.println("Nomes ordenados: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }

    private static void selectionSort(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int menor = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].length() < array[menor].length()) {
                    menor = j;
                }
            }
            
            String temp = array[menor];
            array[menor] = array[i];
            array[i] = temp;
        }
    }
}

