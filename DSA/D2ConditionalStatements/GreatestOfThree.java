package D2ConditionalStatements;

import java.util.Scanner;

public class GreatestOfThree {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:");
        int b = sc.nextInt();
        System.out.print("Enter third Number:");
        int c = sc.nextInt();

        if (a>=b && a >= c) {
            System.out.println(a);
        }else if (b>=a && b>=c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
}
