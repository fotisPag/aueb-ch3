package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενός αριθμού n
 * με τη χρήση του τριαδικού τελεστή
 *
 * @fotisPag
 */

public class TernaryOperator {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int n, abs;

        System.out.println("Δώστε ένα ακέραιο αριθμό");
        n = in.nextInt();
//1η περίπτωση
//        if (n >=0){
//            abs = n;
//        } else {
//            abs = - n;
//        }
        //2η περίπτωση
//        abs = (n >= 0) ? n : -n;
//        System.out.printf("Το απόλυτο του %d είναι %d", n, abs);

        //3η περίπτωση
        System.out.printf("Το απόλυτο του %d είναι %d", n, (n >= 0) ? n : -n);
    }
}
