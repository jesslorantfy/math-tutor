/* MathTutor.java
* Allows the user to answer simple math problems
* Jess L
* November 24, 2017
*/
package mathtutor;

import java.util.Scanner;

/**
*
* @author jessica.lorantfy
*/
public class MathTutor {

    /**
     * Finds the greatest common factor between two numbers
     * @param num1 The first operand
     * @param num2 The second operand
     */
    private static int gcf(int num1, int num2) {
        int gcf = 1;
        for(int i = 1; i <= num1 && i <= num2; i++) {
            if (num2 % i == 0 && num1 % i == 0) {
                gcf = i;
            }
        }

        return gcf;
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // Initlizes the scanner instance to use to get user input
        Scanner input = new Scanner(System.in);

        // Int variables for storing operands/operators/etc.
        int userAns, computerAns, num1, num2, num3, opt, off;
        System.out.println("MATH TUTOR");
        System.out.println("Goal: Answer simple math problems");

        /**
         * Input three random numbers and one operator.
         * Get's numbers between 1 and 50
         */
        num1 = (int) (50 * Math.random() + 1);
        num2 = (int) (50 * Math.random() + 1);
        num3 = (int) (50 * Math.random() + 1);
        opt = (int) (5 * Math.random() + 1);

        // Display, prompt and calculate for the addition operator.
        if (opt == 1) {
            System.out.println("What is: " + num1 + "+" + num2 + "+" + num3 + "?");
            userAns = input.nextInt();
            computerAns = num1 + num2 + num3;

        // Display, prompt and calculate for the subtraction operator.
        } else if (opt == 2) {
            System.out.println("What is: " + num1 + "-" + num2 + "-" + num3 + "?");
            userAns = input.nextInt();
            computerAns = num1 - num2 - num3;

        // Display, prompt and calculate for the division operator.
        } else if (opt == 3) {
            System.out.println("What is:  " + num1 + "/" + num2 + "/" + num3 + "?");
            userAns = input.nextInt();
            computerAns = (int) num1 / num2 / num3;

            //Display, prompt and calculate for the multiplication operator.
        } else if(opt == 4) {
            System.out.println("What is the greatest common factor between " + num1 + "," + num2 + "? ");
            userAns = input.nextInt();
            computerAns = gcf(num1, num2);
        } else {
            System.out.println("What is " + num1 + "*" + num2 + "*" + num3 + "?");
            userAns = input.nextInt();
            computerAns = num1 * num2 * num3;
        }

        // Calculate how much the user was off by
        off = Math.abs(computerAns - userAns);        

        // Display if the answer is incorrect, by how much they were away and that they're way off.
        if (userAns != computerAns && off > 20) {
            System.out.println("Sorry, that's incorrect.");
            System.out.println("The correct answer is: " + computerAns);
            System.out.println("You were off by " + off);
            System.out.println("You're were way off. Please, try again.");

        // Display if the answer is incorrect, by how much they were away and that they are close.
        } else if (userAns != computerAns && off < 20) {
            System.out.println("Sorry, that's incorrect.");
            System.out.println("The correct answer is: " + computerAns);
            System.out.println("You were off by " + off);
            System.out.println("You are close, try again.");

        // Display is the player's answer is within 20 away from the actual answer.
        } else {
            System.out.println("Correct!");
        }
    }
}
