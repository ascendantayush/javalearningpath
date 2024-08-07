import java.io.*;
import java.util.*;

public class reverse_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean answer = true;
        int l = 0;
        int r = A.length() - 1;
        while (r > l) {
            if (A.charAt(l) != A.charAt(r)) {
                answer = false;
                break;
            }

            l++;
            r--;
        }

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
