package Conditional_L1;

// Take two number and print the largest one.

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();

        if (num1>num2) {
            System.out.println("First Number is Largest: "+num1);
        }else if (num1<num2) {
            System.out.println("Second Number is Largest: "+num2);
        }else{
            System.out.println("Both Number are Equal");
        }
        
        sc.close();
    }
}
