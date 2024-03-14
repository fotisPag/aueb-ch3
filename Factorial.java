package gr.aueb.cf.ch3;
import java.util.Scanner;


public class Factorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, i = 1;;
        int facto = 1;
        System.out.println("Δώσε αριθμο");
        n = in.nextInt();


        //while
        while (i <= n){
            facto = facto * i;
            i++;
        }

        System.out.printf("Ο factorial αριθμός του %d είναι: %d", n, facto);

    }

}
