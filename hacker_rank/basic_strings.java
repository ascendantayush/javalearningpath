import java.io.*;
import java.util.*;

public class basic_strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int size1 = A.length();
        int size2 = B.length();
        int size_final = size1 + size2;
        System.out.println(size_final);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String A2 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A2 + " " + B2);
    }
}
