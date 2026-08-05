package Conditional_L1;

import java.util.Scanner;

// check if a number is even or odd.

public class Question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
