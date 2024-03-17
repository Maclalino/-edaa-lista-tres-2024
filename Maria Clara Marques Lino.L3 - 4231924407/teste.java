 

import java.util.Scanner;

class teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int numeroDoUsu;

         System.out.println("Digite um número");
         numeroDoUsu=scanner.nextInt();

         for(int i=1; i <= numeroDoUsu; i++){
            System.out.println(i);
         }
         scanner.close();
    }
}