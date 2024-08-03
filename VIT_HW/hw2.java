// A	 triangle	 is	 valid	 if	 the	 sum	 of	 all	 the	 three	
// angles	is	equal	to	180	degrees.	Write	a program	
// that	 asks	 the	 user	 to	 enter	 three	 integers	 as	
// angles	and	check	whether	a triangle	is	valid	or	
// not.

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter the first angle of the triangle : ");
        double angle1 = cin.nextDouble();

        System.out.println("Enter the second angle of the triangle : ");
        double angle2 = cin.nextDouble();

        System.out.println("Enter the third angle of the triangle : ");
        double angle3 = cin.nextDouble();

        if (angle1 + angle2 + angle3 == 180.0) {
            System.out.println("Triangle is possible");
        } else {
            System.out.println("Triangle is not possible");
        }

        cin.close();
    }
}
