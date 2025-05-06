package ESERCIZIO3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Inserisci una stringa (digita ':q' per uscire):");

        while (true) {
            input = scanner.nextLine();
            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }
            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i != input.length() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
