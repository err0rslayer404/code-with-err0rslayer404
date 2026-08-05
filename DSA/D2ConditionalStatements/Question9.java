package Conditional_L1;

import java.util.Scanner;

// Take a character and check if it is vowel or consonent.

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'a' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("vowel");
        }else{
            System.out.println("Consonent");
        }
        sc.close();

    }
}
