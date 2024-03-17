package QuestaoTres;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        char[] caracteres = input.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres.length - 1; j++) {
                if (caracteres[j] > caracteres[j + 1]) {
                    char a = caracteres[j];
                    caracteres[j] = caracteres[j + 1];
                    caracteres[j + 1] = a;
                }
            }
        }

        System.out.print("String ordenada: ");
        for (char c : caracteres) {
            System.out.print(c);
        }
        scanner.close();
    }
}
