package D2ConditionalStatements;

import java.util.Scanner;

public class AbsoluteValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num<0){
            System.out.println(-num);
        }else {
            System.out.println(num);
        }
    }
}
