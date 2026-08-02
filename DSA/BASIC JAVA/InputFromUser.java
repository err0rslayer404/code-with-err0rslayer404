package D1BasicJava;

import java.util.Scanner;

public class InputFromUser {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // inputs lene ke liye

        System.out.print("Enter the Radius: ");
        double r = sc.nextDouble();
        double a = 3.14*r*r;
        System.out.println(a);
    }
}
