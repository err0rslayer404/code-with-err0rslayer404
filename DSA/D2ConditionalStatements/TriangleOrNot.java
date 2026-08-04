package D2ConditionalStatements;
// Take 3 positive integer input and tell if they can be side of a triangle or not.

import java.util.Scanner;

public class TriangleOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a+b>c && b+c>a && c+a>b ){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Not a Valid triangle");
        }
    }
}
