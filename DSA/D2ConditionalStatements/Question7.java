package Conditional_L1;

import java.util.Scanner;

// Take three number and print the largest one.

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
          System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
          System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("First Number is Largest: " + num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println("Second Number is Largest: " + num2);
        }else if (num3>num1 && num3>num2) {
            System.out.println("Third Number is Largest" + num3);
        }else{
            System.out.println("All number are equal");
        }
        sc.close();
    }
}
