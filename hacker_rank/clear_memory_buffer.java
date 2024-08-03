import java.util.Scanner;

public class clear_memory_buffer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
      
        scan.nextLine();  //used to clear the "\n" newline character from the memory buffer
      
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
