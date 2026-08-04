package D2ConditionalStatements;

import java.util.Scanner;

public class HWQuestion2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);

        if (area>perimeter){
            System.out.println("Area is greater");
        }else {
            System.out.println("Perimeter is greater");
        }
    }
}
