// Telephone Bill
// Write a program to calculate the monthly
// telephone	bills	as	per	the	following rule:	
// Minimum	Rs.	200	for	up	to	100	calls.
// Plus	Rs.	0.60	per	call for	next 50 calls.	
// Plus Rs. 0.50 per call for next	50 calls.
// Plus Rs. 0.40 per call for any call beyond 200 calls
import java.util.*;
public class hw1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the total number of call made by user: ");
        int ncall = cin.nextInt();
        double amout = 0;

        if (ncall <= 100) {
            amout = 200;
        } else if (ncall > 100 && ncall <= 150) {
            amout = 200 + (ncall - 100) * 0.60;
        } else if (ncall > 150 && ncall <= 200) {
            amout = 200 + 50 * 0.6 + (ncall - 150) * 0.50;
        } else if (ncall > 200) {
            amout = 200 + 50 * 0.6 + 0.50 * 50 + (ncall - 200) * 0.40;
        }

        System.out.println("total call amount is: " + amout);
        cin.close();
    }
}
