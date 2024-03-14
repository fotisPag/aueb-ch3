package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου αριθμού
 *
 * Για παράδειγμα ο αριθμός 12 έχει 2 ψηφία,
 * ο 456 έχει 3 ψηφία κ.λ.π
 *
 * @fotisPag
 */

public class DigitsCount {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num, count = 0;
        int result;

        System.out.println("Δώστε ένα ακέραιο αριθμό");
        num = in.nextInt();
        result = num;

        //do .. while
        do {

            result = result / 10;
            count++;

        } while (result != 0);

        System.out.printf("Τo πλήθος των ψηφίων του %d είναι %d", num, count);

    }

}
