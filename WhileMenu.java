package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού, όπου ο χρήστης επιλέγει έναν αριθμό και
 * λαμβάνει ένα feedback. Το 0 είναι έξοδος.
 *
 * @fotisPag
 */

public class WhileMenu {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Παρακαλώ επιλέξτε έναν ακέραιο από 1-3 ή 0 για έξοδο.");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Δώσατε το 0");
            } else if (choice == 1) {
                System.out.println("Δώσατε το 2");
            } else if (choice == 2) {
                System.out.println("Δώσατε το 3");
            } else if (choice == 3) {
                System.out.println("Πρέπει να δώσετε έναν αριθμό από το 1-3 ή 0 για έξοδο");
            }

        } while (choice != 0);

        System.out.println("Έχετε επιλέξει την έξοδο. Καλή συνέχεια!");

    }

}
