package ESERCIZIO2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dammi un numero compreso tra 0 e 3 ->");
        int numero = scanner.nextInt();
        String risultato = trasforma(numero);
        System.out.println(risultato);


    }
    public static String trasforma (int numero ){
        switch (numero) {
            case 0:
                return "ZERO";
            case 1:
                return "UNO";
            case 2:
                return "DUE";
            case 3:
                return "TRE";
            default:
                return "ERRORE NELL'INSERIMENTO";
        }

    }
}
