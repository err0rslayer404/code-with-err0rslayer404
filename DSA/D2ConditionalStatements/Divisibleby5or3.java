package D2ConditionalStatements;

import javax.swing.*;
import java.util.Scanner;

public class Divisibleby5or3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num%5 == 0 || num%3 == 0 ){
            System.out.println("Divisible by 5 or 3");
        } else {
            System.out.println("Not divisible by 5 or 3");
        }
    }
}
