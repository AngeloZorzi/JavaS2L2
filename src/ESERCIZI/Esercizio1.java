package ESERCIZI;

import java.util.Scanner;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una frase");
        String testo = scanner.nextLine();

        boolean risultato = pariDispari(testo);
        System.out.println(risultato);


        System.out.println("Dammi un anno, ti dirò se è bisestile:");
        int anno = scanner.nextInt();
        boolean isIt = annoBisestile(anno);
        System.out.println("L'anno è bisestile? " + isIt);

    }

    public static boolean pariDispari(String testo){
        if(testo.length()%2==0){
            return false;
        }else{
            return true;
        }
    };

    public static boolean annoBisestile(int anno) {
        if (anno % 4 != 0) {
            return false;
        } else if (anno % 100 != 0) {
            return true;
        } else {
            return anno % 400 == 0;
        }
    }
}
