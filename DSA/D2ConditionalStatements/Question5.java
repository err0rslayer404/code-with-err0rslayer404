package Conditional_L1;


// check if given year is leap year


import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year%4==0 && year%100!=0 || year%400==0) {
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap year");
        }
        sc.close();
    }
}
