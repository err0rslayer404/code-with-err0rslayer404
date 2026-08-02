package D1BasicJava;

import java.util.Scanner;

public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        int p = sc.nextInt();
        System.out.print("Enter rate: ");
        int r = sc.nextInt();
        System.out.print("Enter time: ");
        int t = sc.nextInt();

        double si = (p*r*t)/100.0;
        System.out.println("The simple interest is: " + si);

    }
}
