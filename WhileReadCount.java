package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
* Διαβάζει από το πληκτρολόγιο std input ακεραίους αριθμούς μέχρι να βρει θετικό.
* Μετράει το πλήθος των αρνητικών αριθμών.
* @author fotisPag
* */

public class WhileReadCount {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int num, counter = 0;

        System.out.println("Δώστε έναν ακέραιο αριθμό.");
        num = in.nextInt();

        //while
        while (num < 0) {
            counter++;
            System.out.println("Ήταν αρνητικός. Δώστε επόμενο αριθμό..");
            num = in.nextInt();
        }
        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το πλήθος των αρνητικών αριθμών είναι " + counter);

    }

}
