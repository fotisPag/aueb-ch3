package gr.aueb.cf.ch3;

import java.util.Scanner;
public class BooleanDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //literals
        boolean b1 = true;
        boolean b2 = false;

        int num, absNum;

        /*
        * >, >=, <, <=, ==, !=
        * */

        System.out.println("Δώσε ένα αριθμό");
        num = in.nextInt();

        boolean b3 = (num == 0);
        boolean numIsEven = ((num % 2) == 0);
        boolean numIsOdd = ((num % 2) != 0);

        /*
        * Διακλάδωση if-then-else και εκχώρηση
        * */


        if (num > 0) {
            absNum = num;
        } else {
            absNum = - num;
        }

        /*
        * Τριαδικός τελεστής και εκχώρηση
        * */

        absNum = (num > 0 ) ? num : -num;

        /*
        * Διακλάδωση if-then-else και print
        * */
        if (numIsEven) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is Odd");
        }

        /*
        * Τριαδικός τελεστής και print
        * */

        System.out.printf("Number is %s", (numIsEven) ? "even" : "odd");


        /*
        * Παραστάσεις αλήθειας με τη χρήση των τελεστών αλήθειας
        * && (AND), || (OR), ! (NOT)
        * */

        System.out.println("Δώσε ένα αριθμό");
        num = in.nextInt();

        if ((num != 100) && (numIsEven)) {
            System.out.println("Το num δεν είναι 100 και είναι άρτιος");
        } else {
            System.out.println("Το num δεν είναι 100 ή δεν είναι άρτιος");
        }


        /*
        * Εάν ένα μέρος των λογικών τελεστών  && δεν είναι αληθές, τότε και η υπόλοιπη παράσταση είναι false
        * */
        if (((num % 100) == 0) && ! ((num % 400) == 0)) {
            System.out.println("Ο αριθμός");
        }


    }


}
