package Conditional_L1;

import java.util.Scanner;

// check if a number is divisible by 5 or not.


public class Question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num%5==0) {
            System.out.println("Number is Divisible by 5");
        }else{
            System.out.println("Number is not divisible by 5");
        }
        sc.close();
    }
}
