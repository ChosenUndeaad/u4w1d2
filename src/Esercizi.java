package Esercizi;

import java.util.Scanner;

public class Esercizi {

    // Esercizio #1: if-else if
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // Esercizio #2: switch
    public static void numeroInLettere() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero (da 0 a 3): ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Due");
            case 3 -> System.out.println("Tre");
            default -> System.out.println("Errore: numero fuori dal range consentito (0-3)");
        }
    }

    // Esercizio #3: while
    public static void suddividiStringa() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Inserisci una stringa (\":q\" per uscire): ");
            input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }

            for (int i = 0; i < input.length(); i++) {
                System.out.print(input.charAt(i));
                if (i != input.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    // Esercizio #4: for
    public static void contoAllaRovescia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero intero per il conto alla rovescia: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli un esercizio da eseguire:");
        System.out.println("1 - Stringa pari/dispari e anno bisestile");
        System.out.println("2 - Numero in lettere");
        System.out.println("3 - Suddividi stringa");
        System.out.println("4 - Conto alla rovescia");
        System.out.print("Scelta: ");
        int scelta = scanner.nextInt();
        scanner.nextLine();

        switch (scelta) {
            case 1 -> {
                System.out.print("Inserisci una stringa: ");
                String s = scanner.nextLine();
                System.out.println("La stringa è pari? " + stringaPariDispari(s));

                System.out.print("Inserisci un anno: ");
                int anno = scanner.nextInt();
                System.out.println("L'anno è bisestile? " + annoBisestile(anno));
            }
            case 2 -> numeroInLettere();
            case 3 -> suddividiStringa();
            case 4 -> contoAllaRovescia();
            default -> System.out.println("Scelta non valida.");
        }

        scanner.close();
    }
}
