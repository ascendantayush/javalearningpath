import java.util.*;
import java.io.*;

public class series{

    public static int power(int exponents) {
        int base = 2;
        int result = 1;

        if (exponents == 0) {
            return result;
        } else {
            for (int i = 1; i <= exponents; i++) {
                result = result * 2;
            }

            return result;
        }
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int array_b[] = new int[t];
        int array_c[] = new int[t];
        int array_a[] = new int[t];

        for (int i = 0; i < t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            array_a[i] = a;
            array_b[i] = b;
            array_c[i] = n;

        }

        for (int j = 0; j < t; j++) {
            int sum = array_a[j];

            for (int k = 0; k < array_c[j]; k++) {
                sum = sum + (power(k) * array_b[j]);
                System.out.print(sum + " ");
            }

            System.out.println();
        }

        in.close();
    }
}
