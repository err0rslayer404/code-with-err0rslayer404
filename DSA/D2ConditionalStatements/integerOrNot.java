package D2ConditionalStatements;

import java.util.Scanner;

public class integerOrNot {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        double num = sc.nextDouble();
        int x = (int)num;
        if(num-x == 0){
            System.out.println("Is an Integer");
        }else {
            System.out.println("Not an integer");
        }
    }
}
