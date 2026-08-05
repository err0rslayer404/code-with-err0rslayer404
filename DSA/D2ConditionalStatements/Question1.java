package Conditional_L1;

import java.util.Scanner;

// Take a number and print wheather it's positive negative or zero


public class Question1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("Positive");
        }else if(num<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();

    }
}
