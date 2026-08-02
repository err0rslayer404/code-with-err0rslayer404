package D1BasicJava;

import java.util.Scanner;

public class SumOfThreeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Number: ");
        int num3 = sc.nextInt();

        int sum = num1+num2+num3;
        System.out.println("The sum is: " + sum);
    }
}
