package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το μέσο όρο της βαθμολογίας των μαθημάτων και
 * εκτυπώνει αντίστοιχα μηνύματα. Ο χρήστης εισάγει το πλήθος των μαθημάτων
 * και το σύνολο της βαθμολογίας.
 *
 * @fotisPag
 */

public class Grades {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int mathimata, gradesSum, average;

        System.out.println("Δώστε πλήθος μαθημάτων");
        mathimata = in.nextInt();
        System.out.println("Δώστε σύνολο της βαθμολογίας");
        gradesSum = in.nextInt();

        //Εντολές
        if (mathimata != 0 ) {
            average = gradesSum / mathimata;

           if (average >= 8) {
                System.out.printf("Μέσος όρος: %d --Άριστα", average);
            } else if (average >= 6) {
               System.out.printf("Μέσος όρος: %d --Λείαν Καλώς", average);
            } else if (average >= 6) {
               System.out.printf("Μέσος όρος: %d --Λείαν Καλώς", average);
            }  else if (average >= 5) {
               System.out.printf("Μέσος όρος: %d --Καλώς", average);
            }  else {
               System.out.printf("Μέσος όρος: %d --Κάτω από τη βάση", average);
           }
        } else {
            System.out.println("Το πλήθος των μαθημάτων δεν μπορεί να είναι μηδέν");
        }





    }

}
