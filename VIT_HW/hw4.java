// Write	a	program	to	calculate	the	net	salary	of	a	
// medical	 representative	 based	 on	 the	 sales.	
// Bonus	and	incentives	will	be	 offered	based	 on	
// total	sales.	If	the	total	sales	amount	exceeds Rs.	
// 100000	then	follow	the	particulars	in	Column	1,	
// otherwise	follow	the	particulars	in	Column	2.

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double basic = 3000;
        double hra, da, incentive, bonus = 500;
        double totalSales, netSalary;

        System.out.println("Enter the total sales amount: ");
        totalSales = scanner.nextDouble();

        if (totalSales > 100000) {
            hra = 0.20 * basic;
            da = 0.80 * basic;
            incentive = 0.10 * totalSales;
        } else {

            hra = 0.30 * basic;
            da = 0.85 * basic;
            incentive = 0.15 * totalSales;
        }

        netSalary = basic + hra + da + incentive + bonus;

        System.out.println("Net Salary Components:");
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Incentive: " + incentive);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
