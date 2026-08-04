package D2ConditionalStatements;

import java.util.Scanner;

public class fourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num>999 && num<10000){
            System.out.println("Four digit number");
        }else {
            System.out.println("Not a four digit number");
        }
    }
}
