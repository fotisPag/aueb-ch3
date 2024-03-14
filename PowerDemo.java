package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Υπολογίζει τη δύναμη a^b
 *
 * @fotisPag
 */


public class PowerDemo {

    public static void main(String[] args){
        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int a,b;
        long result = 1;
        int i = 1;

        System.out.println("Δώστε δύο ακεραίους");
        a = in.nextInt();
        b = in.nextInt();

        //while
        while (i <= b) {
            result = result * a;
            i++;
        }
        //Εκτύπωση των αποτελεσμάτων
        System.out.printf("Η δύναμη του %d εις την %d έίναι: %d", a, b, result );
        in.close();
    }

}
