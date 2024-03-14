package gr.aueb.cf.ch3;

import java.util.Scanner;

/*
* Διαβάζει ακεραίους αριθμούς από το standard input μέχρι να βρει θετικό αριθμό. Δηλαδή αγνοεί όλους τους αρνητικούς.
* @fotisPag
* */

public class WhileRead {

    public static void main(String[] args){
        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Δώστε ένα ακέραιο αριθμό");
        num = in.nextInt();

        //while
        while (num < 0) {
            System.out.println("Ο αριθμός ήταν αρνητικός. Δώστε επόμενο αριθμό...");
            num = in.nextInt();
        }
        //Εμφάνιση ή εκτύπωση αποτελεσμάτων
        System.out.printf("Ο τελευταίος αριθμός ήταν ο %d", num);

    }

}
