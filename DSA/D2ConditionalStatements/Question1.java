package D2ConditionalStatements;

//Take positive integer input and print
//    Roshni  if number is divisible by 5.
//    Riya    if number is divisible by 3.
//    Ram     if number is divisible by 5 & 3 both.
//    Isha    if number is divisible by 5 or 3.

import java.util.Scanner;

public class Question1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if (n%5 ==0 && n%3 == 0){
            System.out.println("Ram");
        }else if (n%3 == 0){
            System.out.println("Riya");
        }else if (n%5 == 0){
            System.out.println("Roshni");
        }else {
            System.out.println("Isha");
        }
    }
}
