//  Write	a	program	to categorize	an	adult	


import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int height;

        System.out.println("Enter your height in cm's : ");
        height = cin.nextInt();

        if (height <= 150) {
            System.out.println("Dwarf");
        } else if (height > 150 && height <= 165) {
            System.out.println("Average height ");
        } else if (height > 165 && height <= 195) {
            System.out.println("Taller");
        } else {
            System.out.println("Abnormal height");
        }

        cin.close();
    }
}
