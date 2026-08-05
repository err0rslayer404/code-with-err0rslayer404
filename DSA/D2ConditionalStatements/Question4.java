package Conditional_L1;

import java.util.Scanner;

// check if a number is divisible by both 3 and 5


public class Question4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num = sc.nextInt();

        if (num%3==0 && num%5==0) {
            System.out.println("Divisible by Both 3 and 5");
        }else{
            System.out.println("No, Number is not divisible by both 3 and 5");
        }
        sc.close();
    }
}
