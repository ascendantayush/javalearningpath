
// Discount and Revenue
// Revenue	can	be	calculated	as	the	selling	price	of	
// the	product	times	the	quantity	sold,	i.e.	revenue	
// =	price	×	quantity.	Write	a	program	that	asks	the	
// user	 to	 enter	 product	 price	 and	 quantity	 and	
// then	 calculate	 the	 revenue.	 If	 the	 revenue	 is	
// more	 than	 5000	 a	 discount	 is	 10%	 offered.	
// Program	 should	 display	 the	 discount	 and	 net	
// revenue.
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        double price;
        double quantity;
        double total_amout = 0;
        double discount = 0;

        System.out.println("Enter the price of a single unit product : ");
        price = cin.nextDouble();

        System.out.println("Enter the total number of product sold : ");
        quantity = cin.nextDouble();

        total_amout = quantity * price;

        if (total_amout > 5000) {
            discount = total_amout * 0.1;
        }

        total_amout = total_amout - discount;

        System.out.println("Discount offered : " + discount);
        System.out.println("Net revenue after discount : " + total_amout);

        cin.close();

    }
}
